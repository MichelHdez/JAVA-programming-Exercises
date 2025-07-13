package com.mx.CrudTienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudTienda.dominio.Usuarios;

@Repository
public interface UsuariosDao extends JpaRepository<Usuarios, Integer>{

	Usuarios findByNombre(String nombre);
}
