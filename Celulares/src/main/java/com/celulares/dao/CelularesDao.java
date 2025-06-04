package com.celulares.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.celulares.dominio.Celulares;

public interface CelularesDao extends JpaRepository<Celulares, Integer>{

}
