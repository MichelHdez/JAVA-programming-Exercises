package com.mx.CrudPeliculasMax.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudPeliculasMax.dominio.Peliculas;

@Repository
public interface PeliculasDao extends CrudRepository<Peliculas, Integer> {

}
