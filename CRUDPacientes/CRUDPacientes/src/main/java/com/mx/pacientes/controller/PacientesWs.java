package com.mx.pacientes.controller;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pacientes.dominio.Pacientes;
import com.mx.pacientes.service.PacientesService;

@RestController
@RequestMapping(path = "api/Pacientes")
@CrossOrigin("*")
public class PacientesWs {

	@Autowired
	PacientesService pacientesService;

	// http://localhost:7500/api/Pacientes/listar
	@GetMapping("listar")
	public ResponseEntity<List<Pacientes>> listar() {
		return ResponseEntity.status(HttpStatus.CREATED).body(pacientesService.lista());
	}

	// http://localhost:7500/api/Pacientes/buscar
	@PostMapping("buscar")
	public ResponseEntity<Pacientes> buscar(@RequestBody Pacientes pacientes) {
		Pacientes pacineteId = pacientesService.buscar(pacientes);
		return ResponseEntity.ok(pacineteId);
	}

	// http://localhost:7500/api/Pacientes/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Pacientes pacientes) {
		String mensaje = null;
		for (Pacientes paciente : pacientesService.lista()) {
			if (paciente.getNombre().equals(pacientes.getNombre())) {
				mensaje = "Cliente existente en la Base de Datos: " + paciente.getNombre();
			} else {
				Date hoy = new Date();
				System.out.println("DATE--> " + hoy.toLocaleString());
				int diferencia = (hoy.getYear() - pacientes.getFechaNacimiento().getYear());
				System.out.println("Diferencia de edad--> " + diferencia);
				pacientes.setEdad(diferencia);
				if (pacientes.getEdad() <= 30) {
					if ((pacientes.getTipoSangre().equals("O-POSITIVO"))
							|| pacientes.getTipoSangre().equals("O-NEGATIVO")) {
						if (pacientes.getTipoEnfermedad().equals("FIEBRE")
								|| pacientes.getTipoEnfermedad().equals("COVID")) {
							pacientesService.guardar(pacientes);
							mensaje = "Cliente guardado!: " + pacientes.getNombre();
						} else {
							mensaje = "No contiene los 2 tipos de enfermedades validas";
							return new ResponseEntity<String>(mensaje, HttpStatus.OK);
						}
					} else {
						mensaje = "No contiene los 2 tipos de sangre validos";
						return new ResponseEntity<String>(mensaje, HttpStatus.OK);
					}
				} else {
					mensaje = "La edad no cumple! " + pacientes.getNombre();
				}
			}
		}
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

	// http://localhost:7500/api/Pacientes/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Pacientes pacientes) {
		String mensaje = null;
		Date hoy = new Date();
		int diferencia = hoy.getYear() - pacientes.getFechaNacimiento().getYear();
		pacientes.setEdad(diferencia);

		if (pacientes.getEdad() <= 30) {
			if ((pacientes.getTipoSangre().equals("O-POSITIVO") || pacientes.getTipoSangre().equals("O-NEGATIVO"))) {
				if (pacientes.getTipoEnfermedad().equals("FIEBRE") || pacientes.getTipoEnfermedad().equals("COVID")) {
					boolean buscarEncontrar = false;
					for (Pacientes p : pacientesService.lista()) {
						if (p.getId() != pacientes.getId() && p.getNombre().equals(pacientes.getNombre())) {
							buscarEncontrar = true;
							break;// Termina la consulta
						}
					}
					if (!buscarEncontrar) {
						pacientesService.editar(pacientes);
						mensaje = "Paciente editado!: " + pacientes.getNombre();
					} else {
						mensaje = "YA EXISTE ESTE PACIENTE!!!";
					}
				} else {
					mensaje = "Los 2 tipos de enfermedades no son validas!";
				}
			} else {
				mensaje = "Los 2 tipos de sangre no son validas!";
			}
		} else {
			mensaje = "Usted es menor a 30!";
		}
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

	// http://localhost:7500/api/Pacientes/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Pacientes pacientes) {
		pacientesService.eliminar(pacientes);
		return new ResponseEntity<String>("Paciente eliminado! " + pacientes.getNombre(), HttpStatus.OK);
	}
}
