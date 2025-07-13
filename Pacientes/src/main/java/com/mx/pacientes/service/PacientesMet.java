package com.mx.pacientes.service;

import java.util.List;

import com.mx.pacientes.entidad.Pacientes;

public interface PacientesMet {
	
	public List<Pacientes>  lista();
	public void guardar(Pacientes pacientes);
	public void editar(Pacientes pacientes);
	public void eliminar (Pacientes pacientes);
	public Pacientes buscar(Pacientes pacientes);
	Pacientes findByNombre(String nombre);


}
