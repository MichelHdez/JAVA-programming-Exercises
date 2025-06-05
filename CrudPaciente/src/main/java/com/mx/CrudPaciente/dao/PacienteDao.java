package com.mx.CrudPaciente.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudPaciente.dominio.Paciente;

public interface PacienteDao extends CrudRepository<Paciente, Integer> {

}
