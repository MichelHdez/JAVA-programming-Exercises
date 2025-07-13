package com.mx.CrudMarcaAutos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudMarcaAutos.dominio.Marca;

@Repository
public interface MarcaDao extends CrudRepository<Marca, Integer> {

}
