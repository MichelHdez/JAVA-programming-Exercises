package com.mx.pacientes.service;

import java.util.List;

import com.mx.pacientes.dominio.Pacientes;


public interface PacientesService {

	public void guardar(Pacientes pacientes);

	public void editar(Pacientes pacientes);

	public void eliminar(Pacientes pacientes);

	public Pacientes buscar(Pacientes pacientes);

	public List<Pacientes> lista();
}
