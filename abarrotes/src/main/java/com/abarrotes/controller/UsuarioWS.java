package com.abarrotes.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abarrotes.dao.UsuarioDao;
import com.abarrotes.entity.Usuario;
import com.abarrotes.service.UsuarioServiceImpl;
@RestController

@RequestMapping(path = "UsuariosWs")
public class UsuarioWS {

	private Logger logger = LoggerFactory.getLogger(UsuarioWS.class);

	private UsuarioServiceImpl imp;

	private UsuarioDao dao;

	public UsuarioWS(UsuarioServiceImpl imp, UsuarioDao dao) {
		this.imp = imp;
		this.dao = dao;
	}

	BCryptPasswordEncoder encoder;

	public UsuarioWS(UsuarioServiceImpl imp, BCryptPasswordEncoder encoder) {
		this.imp = imp;
		this.encoder = encoder;
	}

	// http://localhost:9001/UsuariosWs/listarUsuarios
	@GetMapping("/listarUsuarios")
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.listarUsuarios());
	}

	// http://localhost:9001/UsuariosWs/guardar
	@PostMapping("/guardar")
	public ResponseEntity<String> guardar(@RequestBody Usuario usuario) {
		String mensaje = null;
		Usuario user = dao.findByUsuario(usuario.getUsername());
		logger.info("user-> {}", user);
		if (user != null) {

			mensaje = "Registro exitoso!";
			imp.guardar(usuario);
		}

		return ResponseEntity.status(HttpStatus.OK).body(mensaje);
	}
}
