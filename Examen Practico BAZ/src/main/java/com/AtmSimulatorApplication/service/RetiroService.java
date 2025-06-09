package com.AtmSimulatorApplication.service;

import java.math.BigDecimal;
import java.util.List;

import com.AtmSimulatorApplication.model.Retiro;

public interface RetiroService {

    List<Retiro> obtenerTodosLosRetiros();

    List<Retiro> retirar(Long usuarioId);

    List<Retiro> obtenerRetirosPorUsuario(Long usuarioId);

    Retiro realizarRetiro(String nombreUsuario, BigDecimal monto);
    

}
