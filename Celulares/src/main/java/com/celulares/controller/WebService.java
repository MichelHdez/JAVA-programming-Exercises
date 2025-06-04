package com.celulares.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celulares.dao.CelularesDao;
import com.celulares.dominio.Celulares;
import com.celulares.servicio.Implementacion;

@RestController
@RequestMapping(path = "WebService")
@CrossOrigin("*")
public class WebService {

	Implementacion imp;

	CelularesDao dao;

	public WebService(Implementacion imp, CelularesDao dao) {
		this.imp = imp;
		this.dao = dao;
	}

	// http://localhost:9001/WebService/listaDao
	@GetMapping(path = "listaDao")
	public List<Celulares> listaDao() {
		return dao.findAll();
	}

	// http://localhost:9001/WebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Celulares cel) {
		imp.guardar(cel);
		// @RequestBody -> convetir un objeto en JSON
	}

	// http://localhost:9001/WebService/guardar
	// @PostMapping(path = "guardar")
	// public ResponseEntity<String> guardar(@RequestBody Celulares cel) {
	// String mensaje;
	//
	// if (imp.buscarNombre(cel.getNombre()) != null) {
	// mensaje = "EL empleado " + cel.getNombre() + " ya forma parte del equipo de
	// trabajo";
	//
	// } else {
	// Date fechaHoy = new Date();
	//
	// int diferencia = fechaHoy.getYear() - cel.getFecha_nacimiento().getYear();
	// cel.setEdad(diferencia);
	// if (cel.getEdad() >= 30 && cel.getEdad() <= 40) {
	// imp.guardar(cel);
	//
	// mensaje = "";
	// } else {
	// mensaje = "Ussted no cumple con la edad(30 a 40 anios) para ocupar un puesto
	// en el corporativo";
	// }
	// }
	//
	// return new ResponseEntity<String>(mensaje, HttpStatus.CREATED);
	// }

	// http://localhost:9001/WebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Celulares cel) {
		imp.editar(cel);
	}

	// http://localhost:9001/WebService/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Celulares cel) {
		imp.eliminar(cel);
	}

	// http://localhost:9001/WebService/buscar
	@PostMapping(path = "buscar")
	public Celulares buscar(@RequestBody Celulares cel) {
		cel = imp.buscar(cel);
		return cel;
	}

}
