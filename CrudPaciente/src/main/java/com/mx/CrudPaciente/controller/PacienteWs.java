package com.mx.CrudPaciente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudPaciente.dominio.Paciente;
import com.mx.CrudPaciente.service.PacienteServ;

@CrossOrigin
@RestController
@RequestMapping(path = "/Api/PacienteWs")
public class PacienteWs {
	@Autowired
	PacienteServ pacienteServ;

	//http://localhost:900/Api/PacienteWs/listar
	@GetMapping(path = "listar")
	public List<Paciente> listar() {
		var lista = pacienteServ.listar();
		return lista;
	}

	//http://localhost:900/Api/PacienteWs/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Paciente paciente) {
		pacienteServ.guardar(paciente);
		return new ResponseEntity<String>("Se guardo el paciente" + paciente.getNombre(), HttpStatus.ACCEPTED);
	}

	//http://localhost:900/Api/PacienteWs/editar
	@PostMapping(path = "editar")
	public ResponseEntity<String> editar(@RequestBody Paciente paciente) {
		return new ResponseEntity<String>("Se edito correctamente" + paciente.getNombre(), HttpStatus.ACCEPTED);
	}

	//http://localhost:900/Api/PacienteWs/eliminar
	@PostMapping(path = "eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Paciente paciente) {
		pacienteServ.eliminar(paciente);
		System.out.println("Se elimino paciente " + paciente.getNombre());
		return new ResponseEntity<String>("Se elimino correctamente" + paciente.getNombre(), HttpStatus.OK);
	}

}
