package com.abarrotes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abarrotes.entity.Abarrote;

@Repository
public interface AbarroteDao extends JpaRepository<Abarrote, Integer>{
	
	Abarrote findByNombreProducto(String nombreProducto);
	Abarrote findByMarca(String marca);
	

}
