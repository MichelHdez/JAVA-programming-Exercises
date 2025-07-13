package com.mx.pacientes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pacientes.entidad.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer>{
	Doctor findByNombre(String nombre);

}
