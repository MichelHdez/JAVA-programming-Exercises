package com.mx.Empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleados.dominio.Employees;

@Repository
public interface EmpleadosDao extends JpaRepository<Employees, Integer> {

}
