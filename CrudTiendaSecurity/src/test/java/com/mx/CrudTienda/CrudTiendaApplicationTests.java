package com.mx.CrudTienda;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mx.CrudTienda.dao.TiendaDao;
import com.mx.CrudTienda.dao.UsuariosDao;
import com.mx.CrudTienda.dominio.Usuarios;
import com.mx.CrudTienda.servicios.ImpUsuarios;
import com.mx.CrudTienda.servicios.TiendaServImp;

@SpringBootTest
class CrudTiendaApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	TiendaDao dao;
	
	@Autowired
	UsuariosDao user;
	
	@Autowired
	TiendaServImp imp;
	
	@Autowired
	ImpUsuarios usuarios;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Test
	public void guardarUser() {
		Usuarios us = new Usuarios();
		us.setId(2);
		us.setNombre("Ivan");
		us.setPassword(encoder.encode("123"));
		Usuarios enviarUsuario = usuarios.guardar(us);
		
		assertTrue(enviarUsuario.getPassword().equalsIgnoreCase(us.getPassword()));
	}
}
