package com.mx.Empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleados.dominio.Genders;

@Repository
public interface GendersDao extends JpaRepository<Genders, Integer>{

}
