package com.mx.Empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleados.dominio.Jobs;

@Repository
public interface JobsDao extends JpaRepository<Jobs, Integer>{

}
