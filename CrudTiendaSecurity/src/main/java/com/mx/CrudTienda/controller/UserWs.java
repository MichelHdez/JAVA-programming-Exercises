package com.mx.CrudTienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.CrudTienda.dominio.Usuarios;
import com.mx.CrudTienda.servicios.MetodosUsuarios;

@RestController
@RequestMapping("userWs")
@CrossOrigin
public class UserWs {

	@Autowired
	MetodosUsuarios serv;
	
	//http://localhost:9000/userWs/listar
	@GetMapping("listar")
	public List<Usuarios> listar() {
		var lista = serv.listar();
		return lista;
	}
	
	//http://localhost:9000/userWs/guardarUsuario
		@PostMapping("guardar")
	public void guardarUsuario(@RequestBody Usuarios usuarios) {
		System.out.println("Usuario a guardar... " + usuarios);
		serv.guardarUsuario(usuarios);
		}
}
