package com.mx.CrudComputadoras.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudComputadoras.dominio.Computadoras;

@Repository
public interface ComputadorasDao extends CrudRepository<Computadoras, Integer>{
	
	/*CrudRepository --> es clase de spring data y contiene todos metodos de un crud 
	 * para cualquier aplicacion 
	 * 
	 * Computadoras findByNombre(Computadoras comp);
	 * Select * from COmputadoras where nombre=?
	 * 
	 * QueryNative 
	 * */
	
	

}
