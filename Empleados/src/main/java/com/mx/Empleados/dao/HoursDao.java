package com.mx.Empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleados.dominio.Employee_worked_hours;

@Repository
public interface HoursDao extends JpaRepository<Employee_worked_hours, Integer>{

}
