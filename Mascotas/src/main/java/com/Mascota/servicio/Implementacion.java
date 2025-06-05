package com.Mascota.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.Mascota.dao.MascotaDao;
import com.Mascota.dominio.Mascota;

@Service
public class Implementacion implements Metodos {

	private Logger logger = LoggerFactory.getLogger(Implementacion.class);

	private MascotaDao dao;

	public Implementacion(MascotaDao dao) {
		this.dao = dao;
	}

	@Override
	public void guardar(Mascota mas) {
		boolean exist = false;
		for (Mascota m : listar()) {
			if (m.getNombre().equals(mas.getNombre())) {
				logger.info("Esa mascota ya existe");
				exist = true;
			}
		}
		if (!exist) {
			dao.save(mas);
		}
	}

	@Override
	public void editar(Mascota mas) {
		dao.save(mas);
	}

	@Override
	public void eliminar(Mascota mas) {
		dao.delete(mas);
	}

	@Override
	public Mascota buscar(Mascota mas) {
		return dao.findById(mas.getId()).orElse(null);
	}

	@Override
	public List<Mascota> buscarNombre(Mascota mas) {
		List<Mascota> lista = new ArrayList<>();
		for (Mascota m : listar()) {
			if (m.getNombre().equals(mas.getNombre())) {
				lista.add(m);
			}
		}
		return lista;
	}

	public Mascota edad(Mascota mas) {
		Date fecha = new Date();
		int diferenciaEdad = fecha.getYear() - mas.getFechaNacimiento().getYear();
		mas.setEdad(diferenciaEdad);
		logger.info("La diferencia de edad es de: {}", diferenciaEdad);

		return dao.findById(mas.getId()).orElse(null);
	}

	@Override
	public List<Mascota> listar() {
		return dao.findAll();
	}

}
