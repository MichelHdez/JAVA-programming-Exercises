package com.mx.pacientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pacientes.entidad.Pacientes;
import com.mx.pacientes.service.ImpPacientes;

@RestController
@RequestMapping(path = "PacientesWs")
@CrossOrigin("*")
public class PacientesWs {

	@Autowired
	ImpPacientes imp;

	// http://localhost:8005/PacientesWs/listar
	@RequestMapping(path = "listar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<List<Pacientes>> lista() {
		var lista = imp.lista();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	// http://localhost:8005/PacientesWs/guardar

	@RequestMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Pacientes pacientes) {

		//////////////////////////////////////////////
		if ((pacientes.getEdad() > 10) && (pacientes.getEdad() <= 30)) {
			if (pacientes.getTipo_sangre().equals("O-POSITIVO") || pacientes.getTipo_sangre().equals("O-NEGATIVO")) {

				if (pacientes.getEnfermedad().equals("FIEBRE") || pacientes.getEnfermedad().equals("COVID")) {
					imp.guardar(pacientes);
					return new ResponseEntity<String>("Se guardo exitosamente", HttpStatus.CREATED);
				}
				return new ResponseEntity<String>("Este tipo de enfermedad no es aceptada", HttpStatus.CREATED);
			}
			return new ResponseEntity<String>("Este tipo de sangre no es aceptada", HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Esta edad no es aceptada", HttpStatus.CREATED);

	}

	// http://localhost:8005/PacientesWs/editar
	@RequestMapping(path = "editar")
	public ResponseEntity<String> editar(@RequestBody Pacientes pacientes) {
		if ((pacientes.getEdad() > 10) && (pacientes.getEdad() <= 30)) {
			if (pacientes.getTipo_sangre().equals("O-POSITIVO") || pacientes.getTipo_sangre().equals("O-NEGATIVO")) {

				if (pacientes.getEnfermedad().equals("FIEBRE") || pacientes.getEnfermedad().equals("COVID")) {
					imp.editar(pacientes);
					return new ResponseEntity<String>("Se edito exitosamente", HttpStatus.CREATED);
				}
				return new ResponseEntity<String>("Este tipo de enfermedad no es aceptada", HttpStatus.CREATED);
			}
			return new ResponseEntity<String>("Este tipo de sangre no es aceptada", HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Esta edad no es aceptada", HttpStatus.CREATED);

	}

	// http://localhost:8005/PacientesWs/eliminar
	@RequestMapping(path = "eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Pacientes pacientes) {
		imp.eliminar(pacientes);
		return new ResponseEntity<String>("Se elimino el registro correctamente", HttpStatus.OK);

	}

	// http://localhost:8005/PacientesWs/buscar
	@RequestMapping(path = "buscar")
	public Pacientes buscar(@RequestBody Pacientes pacientes) {
		return imp.buscar(pacientes);
	}

	// http://localhost:8005/PacientesWs/buscarXnombre
	@RequestMapping(path = "buscarXnombre")
	public Pacientes buscarXnombre(@RequestBody Pacientes pacientes) {
		return imp.buscarXatributo(pacientes);
	}

	// http://localhost:8005/PacientesWs/ganancias
	@RequestMapping(path = "ganancias")
	public ResponseEntity<String> ganancias() {
		var lista = imp.lista();
		double total = 0;
		for (Pacientes p : lista) {
			total += p.getCosto();
			System.out.println("Total: " + total + lista);
		}
		return new ResponseEntity<String>("Total : " + total, HttpStatus.OK);
	}
}
