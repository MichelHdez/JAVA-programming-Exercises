package com.mx.CrudMarcaAutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudMarcaAutos.dominio.Marca;
import com.mx.CrudMarcaAutos.servicio.ImpMarca;

@RestController
@RequestMapping(path="MarcaWs")
@CrossOrigin
public class MarcaWs {

	@Autowired
	ImpMarca imp;
	
	
	// http://localhost:9001/MarcaWs/listar
	@GetMapping(path="listar")
	public List<Marca> listar(){
		return imp.listar();
	}
	
	// http://localhost:9001/MarcaWs/guardar
	@PostMapping(path="guardar")
	public void guardar(@RequestBody Marca marca) {
		imp.guardar(marca);
	}
	
	// http://localhost:9001/MarcaWs/editar
	@PostMapping(path="editar")
	public void editar(@RequestBody Marca marca) {
		imp.editar(marca);
	}
	
	// http://localhost:9001/MarcaWs/eliminar
	@PostMapping(path="eliminar")
	public void eliminar(@RequestBody Marca marca) {
		imp.eliminar(marca);
	}
	
	// http://localhost:9001/MarcaWs/buscar
	@PostMapping(path="buscar")
	public void buscar(@RequestBody Marca marca) {
		imp.buscar(marca);
	}
}
