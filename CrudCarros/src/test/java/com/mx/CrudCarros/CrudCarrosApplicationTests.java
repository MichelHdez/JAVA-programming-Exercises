package com.mx.CrudCarros;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mx.CrudCarros.dao.CarrosDao;
import com.mx.CrudCarros.dao.UsuariosDao;
import com.mx.CrudCarros.dominio.Usuarios;
import com.mx.CrudCarros.servicio.CarrosServImp;
import com.mx.CrudCarros.servicio.ImpUsuarios;

@SpringBootTest
class CrudCarrosApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	CarrosDao dao;
	
	@Autowired
	UsuariosDao user;
	
	@Autowired
	CarrosServImp imp;
	
	@Autowired
	ImpUsuarios usuarios;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Test
	public void guardarUser() {
		Usuarios us = new Usuarios();
		us.setId(1);
		us.setNombre("Ana Luisa");
		us.setPassword(encoder.encode("12345"));
		Usuarios enviarUsuario = usuarios.guardar(us);
		
		assertTrue(enviarUsuario.getPassword().equalsIgnoreCase(us.getPassword()));
	}
}
