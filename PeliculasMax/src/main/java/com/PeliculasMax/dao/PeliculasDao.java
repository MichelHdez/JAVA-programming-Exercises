package com.PeliculasMax.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PeliculasMax.dominio.Peliculas;

@Repository
public interface PeliculasDao extends CrudRepository<Peliculas, Integer>{

}
