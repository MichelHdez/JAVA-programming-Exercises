package com.mx.CrudEmpleados.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleados.dominio.Empleado;
import com.mx.CrudEmpleados.servicio.Implementacion;

@RestController
@RequestMapping(path = "EmpleadoWs")
@CrossOrigin("*")
public class EmpleadoWs {

	@Autowired
	Implementacion imp;

	// http://localhost:9002/EmpleadoWs/listar
	@GetMapping(path = "listar")
	public ResponseEntity<List<Empleado>> listar() {

		return ResponseEntity.status(HttpStatus.OK).body(imp.listar());
	}

	@PostMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Empleado empleado) {
		String mensaje;

		if (imp.buscarNombre(empleado.getNombre()) != null) {
			mensaje = "El empelkado " + empleado.getNombre() + "ya es parte del equuipo de trabajo";
		} else {
			Date fechaHoy = new Date();
			int difEdad = fechaHoy.getYear() - empleado.getFecha_nacimiento().getYear();
			empleado.setId(difEdad);
			if (empleado.getEdad() >= 30 && empleado.getEdad() <= 40) {
				mensaje = "Bienvenido al equipo de trabajp,  cumples con la edad";
			} else {
				mensaje = "no cumples con la edad de entre 30 y 40 años para ocupar el puesto";
			}
		}

		return new ResponseEntity<String>(mensaje, HttpStatus.CREATED);
	}

}
