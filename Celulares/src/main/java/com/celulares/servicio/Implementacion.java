package com.celulares.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.celulares.dao.CelularesDao;
import com.celulares.dominio.Celulares;

@Service
public class Implementacion implements Metodos {

	private Logger logger = LoggerFactory.getLogger(Implementacion.class);

	private CelularesDao dao;

	public Implementacion(CelularesDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Celulares> listar() {
		return dao.findAll();
	}

	@Override
	public void guardar(Celulares cel) {
		List<Celulares> lista = dao.findAll();
		if (lista.isEmpty()) {
			dao.save(cel);
		} else {
			for (Celulares c : lista) {
				if (c.getModelo().equals(cel.getModelo()) || (c.getId() == cel.getId())) {
					logger.info("ya existe una celular con ese modelo y/o Id");
					return;
				}
			}
			dao.save(cel);
		}

	}

	@Override
	public void editar(Celulares cel) {
		dao.save(cel);

	}

	@Override
	public void eliminar(Celulares cel) {
		dao.delete(cel);

	}

	@Override
	public Celulares buscar(Celulares cel) {
		cel = dao.findById(cel.getId()).orElse(null);
		return cel;
	}

}
