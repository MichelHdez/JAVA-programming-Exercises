package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.domain.Usuario;
import com.app.errors.UsuarioNoEncontradoException;
import com.app.services.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService serv;
	
	@GetMapping("/index")
	public String index() {
		@SuppressWarnings("unused")
		Integer valor = 100/0;
		// Integer valor = Integer.parseInt("10xaaaa");
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario = serv.obtenerPorId(id);
		
		if (usuario == null) {
			throw new UsuarioNoEncontradoException(id.toString());
		}
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle Usuario : ".concat(usuario.getNombre()));
		return "ver";
	}
	
	// Con Optional de Java 8	
	@GetMapping("/ver/{id}")
	public String version(@PathVariable Integer id, Model model) {
		
		Usuario usuario = serv.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontradoException(id.toString()));
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle Usuario : ".concat(usuario.getNombre()));
		return "ver";
	}
}
