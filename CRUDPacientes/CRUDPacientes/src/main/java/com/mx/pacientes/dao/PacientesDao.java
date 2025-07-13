package com.mx.pacientes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.pacientes.dominio.Pacientes;

@Repository
public interface PacientesDao extends JpaRepository<Pacientes, Integer>{

}
