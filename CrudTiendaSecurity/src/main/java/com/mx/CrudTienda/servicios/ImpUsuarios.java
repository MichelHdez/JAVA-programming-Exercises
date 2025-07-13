package com.mx.CrudTienda.servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mx.CrudTienda.dao.UsuariosDao;
import com.mx.CrudTienda.dominio.Usuarios;

@Service
public class ImpUsuarios implements MetodosUsuarios{

	@Autowired
	UsuariosDao dao;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Override
	public List<Usuarios> listar() {
		return dao.findAll();
	}
	
	@Override
	public Usuarios guardar(Usuarios usuarios) {	
		return dao.save(usuarios);
	}

	@Override
	public Usuarios guardarUsuario(Usuarios usuarios) {
		Usuarios u = new Usuarios();
		
		String password = encoder.encode(usuarios.getPassword());
		usuarios.setPassword(password);
		dao.save(usuarios);
		
		return u;
	}

}
