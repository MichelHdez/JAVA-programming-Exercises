package com.mx.pacientes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pacientes.entidad.Pacientes;


public interface PacientesDao extends JpaRepository<Pacientes, Integer>{
	Pacientes findByNombre(String nombre);


}
