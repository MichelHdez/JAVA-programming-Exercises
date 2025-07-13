package com.mx.CrudMarcaAutos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudMarcaAutos.dominio.Autos;

@Repository
public interface AutosDao extends CrudRepository<Autos, Integer>{

}
