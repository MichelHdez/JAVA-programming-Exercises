package com.mx.CrudMarcaAutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudMarcaAutos.dominio.Autos;
import com.mx.CrudMarcaAutos.servicio.ImpAutos;

@RestController
@RequestMapping(path="AutosWs")
@CrossOrigin
public class AutosWs {

	@Autowired
	ImpAutos imp;
	
	// http://localhost:9001/AutosWs/listar
		@GetMapping(path="listar")
		public List<Autos> listar(){
			return imp.listar();
		}
		
		// http://localhost:9001/AutosWs/guardar
		@PostMapping(path="guardar")
		public void guardar(@RequestBody Autos autos) {
			imp.guardar(autos);
		}
		
		// http://localhost:9001/AutosWs/editar
		@PostMapping(path="editar")
		public void editar(@RequestBody Autos autos) {
			imp.editar(autos);
		}
		
		// http://localhost:9001/AutosWs/eliminar
		@PostMapping(path="eliminar")
		public void eliminar(@RequestBody Autos autos) {
			imp.eliminar(autos);
		}
		
		// http://localhost:9001/AutosWs/buscar
		@PostMapping(path="buscar")
		public void buscar(@RequestBody Autos autos) {
			imp.buscar(autos);
		}
}
