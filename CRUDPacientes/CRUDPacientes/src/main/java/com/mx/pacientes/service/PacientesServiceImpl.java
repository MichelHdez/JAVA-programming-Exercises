package com.mx.pacientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pacientes.dao.PacientesDao;
import com.mx.pacientes.dominio.Pacientes;

@Service
public class PacientesServiceImpl implements PacientesService{

	@Autowired
	PacientesDao pacientesDao;
	
	@Override
	public void guardar(Pacientes pacientes) {
		pacientesDao.save(pacientes);
	}

	@Override
	public void editar(Pacientes pacientes) {
		pacientesDao.save(pacientes);
	}

	@Override
	public void eliminar(Pacientes pacientes) {
		pacientesDao.delete(pacientes);
	}

	@Override
	public Pacientes buscar(Pacientes pacientes) {
		return pacientesDao.findById(pacientes.getId()).orElse(null);
	}

	@Override
	public List<Pacientes> lista() {
		return (List<Pacientes>)pacientesDao.findAll();
	}
	
	
}
