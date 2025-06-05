package com.mx.CrudPaciente.service;

import java.util.List;

import com.mx.CrudPaciente.dominio.Paciente;

public interface PacienteServ {

	//Procedimiento solo ejecutan un bloque de codigo 
	public void guardar (Paciente paciente);
	public void editar (Paciente paciente);
	public void eliminar (Paciente paciente);
	
	
	//funciones-----> retorna un valor
	public Paciente buscar (Paciente paciente);
	public List <Paciente> listar();
	
	//metodos personalizados
	public Paciente buscarXNombre (Paciente paciente);
	public void eliminarXApellido (Paciente paciente);
	
	
	
}
