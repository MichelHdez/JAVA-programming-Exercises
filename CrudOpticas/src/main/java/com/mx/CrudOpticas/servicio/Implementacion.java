package com.mx.CrudOpticas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudOpticas.dao.OpticasDao;
import com.mx.CrudOpticas.dominio.Opticas;

@Service // con esta anotacion le indico a sprint que esta clase representa la logica de
public class Implementacion implements Metodos {

	// Inyeccion de dependencias -->

	/*
	 * Scope permite crear una Unica instacia de un objeto
	 * 
	 * @Autowired(Es la inyaccion de dependencias) creamos un @bean(calse) carga en
	 * el contenedor de spring singleton crea la instancia
	 */

	@Autowired
	OpticasDao dao;

	@Override
	public void guardar(Opticas optic) {
		dao.save(optic);

	}

	@Override
	public void editar(Opticas optic) {
		dao.save(optic);

	}

	@Override
	public void eliminar(Opticas optic) {
		dao.delete(optic);

	}

	@Override
	public Opticas buscar(Opticas optic) {
		optic = dao.findById(optic.getId()).orElse(null);
		return optic;
	}

	@Override
	public List<Opticas> listar() {
		return (List<Opticas>) dao.findAll();
	}

}
