package com.abarrotes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abarrotes.entity.Abarrote;
import com.abarrotes.service.AbarroteServiceImpl;

@RestController
@RequestMapping(path = "api/WS")
@CrossOrigin
public class AbarroteWS {

	private AbarroteServiceImpl imp;

	public AbarroteWS(AbarroteServiceImpl imp) {
		this.imp = imp;
	}

	// http://localhost:9001/api/WS/listar
	@GetMapping(path = "listar")
	public ResponseEntity<?> listar() {
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.listar());
	}

	// http://localhost:9001/api/WS/listar2
	@GetMapping(path = "listar2")
	public ResponseEntity<?> listar2() {
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.listar());
	}

	// http://localhost:9001/api/WS/gurdar
	@PostMapping(path = "gurdar")
	public ResponseEntity<?> gurdar(@RequestBody Abarrote abarrote) {
		String mensaje = null;
		Abarrote producto = imp.buscar(abarrote);
		System.out.println("Procutos->" + producto);
		if (producto != null) {
			mensaje = "Aun tenemos en existencia " + "\nExistencia: " + producto.getStock()
					+ "\nMarca: " + producto.getMarca();
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		} else {
			imp.gurdar(abarrote);
			mensaje = "Se Guardo el produto";
		}

		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}