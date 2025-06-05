package com.mx.CrudOpticas.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudOpticas.dominio.Opticas;

@Repository
public interface OpticasDao extends CrudRepository<Opticas, Integer>{

	/*CrudRepository --> es la clase de spring data y contiene todos metodos de un crud
	 * para cualquier aplicacion
	 */
	
}
