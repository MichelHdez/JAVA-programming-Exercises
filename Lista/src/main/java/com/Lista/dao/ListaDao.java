package com.Lista.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Lista.entidad.Nombres;

@Repository
public interface ListaDao extends CrudRepository<Nombres, Integer>{

	List<Nombres> findById(Nombres nombres);

	@Query("FROM Nombres ORDER BY nombres ASC")
    List<Nombres> findAllOrderByNombresAsc();

}
