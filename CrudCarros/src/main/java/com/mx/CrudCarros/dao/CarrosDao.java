package com.mx.CrudCarros.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudCarros.dominio.Carros;

@Repository
public interface CarrosDao extends CrudRepository<Carros, Integer>  {

}
