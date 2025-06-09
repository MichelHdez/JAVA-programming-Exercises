package com.AtmSimulatorApplication.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AtmSimulatorApplication.model.Denominacion;
import com.AtmSimulatorApplication.model.Retiro;
import com.AtmSimulatorApplication.model.Usuario;
import com.AtmSimulatorApplication.repository.DenominacionRepository;
import com.AtmSimulatorApplication.repository.RetiroRepository;
import com.AtmSimulatorApplication.repository.UsuarioRepository;
import com.AtmSimulatorApplication.service.RetiroService;

@Service
public class RetiroServiceImpl implements RetiroService {

    @Autowired
    private RetiroRepository retiroRepository;

    @Autowired
    private DenominacionRepository denominacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Retiro> retirar(Long usuarioId) {
        return retiroRepository.findAll();
    }

    @Override
    public List<Retiro> obtenerRetirosPorUsuario(Long usuarioId) {
        return retiroRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public Retiro realizarRetiro(String nombreUsuario, BigDecimal monto) {

        /* Verificamos si el monto es mayor a 0 */
        if (monto.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }

        Usuario usuario = usuarioRepository.findByNombre(nombreUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));

        /* Consultamos las denominaciones disponibles para el retiro */
        List<Denominacion> denominaciones = denominacionRepository.findDenominacionesParaRetiro(monto);
        BigDecimal montoRestante = monto;

        List<Denominacion> denominacionesEntregadas = new ArrayList<>();

        /* Calculamos las denominaciones disponibles para el retiro*/
        for (Denominacion denominacion : denominaciones) {
            if (montoRestante.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }

            BigDecimal valorDenominacion = denominacion.getValor();
            int cantidadNecesaria = montoRestante.divide(valorDenominacion, 0, RoundingMode.FLOOR).intValue();
            int cantidadAReducir = Math.min(cantidadNecesaria, denominacion.getCantidad());

            if (cantidadAReducir > 0) {
                denominacionesEntregadas.add(new Denominacion(
                        denominacion.getId(),
                        denominacion.getTipo(),
                        cantidadAReducir,
                        valorDenominacion));

                /* Se reduce la cantidad de la denominación */
                denominacion.reducirCantidad(cantidadAReducir);
                montoRestante = montoRestante
                        .subtract(valorDenominacion.multiply(BigDecimal.valueOf(cantidadAReducir)));
            }

        }

        if (montoRestante.compareTo(BigDecimal.ZERO) > 0) {
            throw new IllegalArgumentException("No hay suficientes denominaciones para completar el retiro.");
        }

        /* Se guarda el retiro junto con los datos del usuario y el monto de la operacion*/
        Retiro retiro = new Retiro();
        retiro.setUsuario(usuario);
        retiro.setMontoRetirado(monto);
        retiroRepository.save(retiro);

        /*Guardamos los cambios en las denominaciones */
        denominacionRepository.saveAll(denominaciones);
        retiro.setDenominacionesEntregadas(denominacionesEntregadas);

        return retiro;
    }

    @Override
    public List<Retiro> obtenerTodosLosRetiros() {
        return retiroRepository.findAll();
    }
}
