package com.mx.CrudEmpleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.CrudEmpleados.dominio.Empleado;

@Repository// para poder tener el acceso a datos de una clase gerneria de jpa
public interface EmpleadoDao extends JpaRepository<Empleado, Integer>{
	//query native
	//query -> nativo para trabajar las peticiones de la base de datos en forma de sql
	//@QUERY es una anotacion o estereotipo para declarar consultas nativas
	// nativequery indica que es un query nativo
	//JDBC ES PURO CON SQL SOLO QUE AQUI EL  QUERY LO ADAPTAMOS DE ACUERDO A JPA REPOSITORY
	@Query(nativeQuery = true, value = "SELECT * FROM EMPLEADOS_ENCOM E WHERE E.NOMBRE =:NOMBRE")
	
	Empleado findByNombre(@Param("NOMBRE") String nombre);
	
	
}
