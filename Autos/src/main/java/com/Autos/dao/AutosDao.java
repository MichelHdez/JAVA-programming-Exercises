package com.Autos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Autos.dominio.Autos;

@Repository
public interface AutosDao extends CrudRepository<Autos, Integer>{

}
