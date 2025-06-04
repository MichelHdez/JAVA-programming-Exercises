package com.Autos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Autos.dominio.Autos;
import com.Autos.servicio.Imp;

@RestController
@RequestMapping("AutosWS")
public class AutosWs {
	
	@Autowired
	Imp imp;
	
	//listar
	//http://localhost:9001/AutosWS/listar
	@GetMapping("listar")
	public List<Autos> listar(){
		return imp.listar();
	}

	//guardar
	//http://localhost:9001/AutosWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Autos a) {
		imp.guardar(a);
	}

	//editar
	//http://localhost:9001/AutosWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Autos a) {
		imp.editar(a);
	}
	//eliminar
	//http://localhost:9001/AutosWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Autos a) {
		imp.eliminar(a);
		
	}
	//buscar
	//http://localhost:9001/AutosWS/buscar
	@PostMapping("buscar")
	public Autos buscar(@RequestBody Autos a) {
		
		return imp.buscar(a);
	}
	//buscarXnombre
	//http://localhost:9001/AutosWS/listarNombre
	@GetMapping("listarNombre")
	public Autos listaNombre(@RequestBody Autos a){
		return imp.buscarXNombre(a);
	}

	//buscarAtributo
	//http://localhost:9001/AutosWS/buscarAtributo
	@GetMapping("buscarAtributo")
	public List<Autos> buscarAtributo(@RequestBody Autos a) {
		return imp.buscarXAtributo(a);
	}

	//eliminarNombre
	//http://localhost:9001/AutosWS/eliminarNombre
	@PostMapping("eliminarNombre")
	public Autos eliminarNombre(@RequestBody Autos a) {
		return imp.elimiXNombre(a);
	}

}
