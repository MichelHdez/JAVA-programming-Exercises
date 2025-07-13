package com.mx.pacientes.service;

import java.util.List;

import com.mx.pacientes.entidad.Doctor;

public interface DoctorMet {

	public List<Doctor>  lista();
	public void guardar(Doctor doctor);
	public void editar(Doctor doctor);
	public void eliminar (Doctor doctor);
	public Doctor buscar(Doctor doctor);

}
