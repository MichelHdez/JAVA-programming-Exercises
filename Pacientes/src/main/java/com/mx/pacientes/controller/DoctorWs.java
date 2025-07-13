package com.mx.pacientes.controller;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pacientes.entidad.Doctor;
import com.mx.pacientes.service.ImpDoctor;

@RestController
@RequestMapping(path = "DoctorWs")
@CrossOrigin("*")
public class DoctorWs {

	@Autowired
	ImpDoctor imp;

	// http://localhost:8005/DoctorWs/listar
	@RequestMapping(path = "listar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<List<Doctor>> lista() {
		var lista = imp.lista();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}

	// http://localhost:8005/DoctorWs/guardar
	@RequestMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Doctor doctor) {
		List<Doctor> lista = imp.lista();
		for (Doctor d : lista) {
			if (d.getNombre().equals(doctor.getNombre())) {
				return new ResponseEntity<String>("error", HttpStatus.CREATED);

			}

		}
		imp.guardar(doctor);

		return new ResponseEntity<String>("guardado", HttpStatus.CREATED);
	}

	// http://localhost:8005/DoctorWs/buscar
	@RequestMapping(path = "buscar")
	public Doctor buscar(@RequestBody Doctor doctor) {
		return imp.buscar(doctor);
	}

	// http://localhost:8005/DoctorWs/buscarXnombre
	@RequestMapping(path = "buscarXnombre")
	public Doctor buscarXnombre(@RequestBody Doctor doctor) {
		return imp.buscarXatributo(doctor);
	}

	// http://localhost:8005/DoctorWs/editar
	@RequestMapping(path = "editar")
	public ResponseEntity<String> editar(@RequestBody Doctor doctor) {
		imp.editar(doctor);
		return new ResponseEntity<String>("Editado", HttpStatus.OK);
	}
	
	// http://localhost:8005/DoctorWs/eliminar
		@RequestMapping(path = "eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Doctor doctor) {
			imp.eliminar(doctor);
			return new ResponseEntity<String>("Eliminado", HttpStatus.OK);
		}
		
	

}
