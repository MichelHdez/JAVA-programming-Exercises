package com.Mascota.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mascota.dominio.Mascota;
import com.Mascota.servicio.Implementacion;

@RestController
@RequestMapping(path = "WebService")
@CrossOrigin("*")
public class WebService {

	private Logger logger = LoggerFactory.getLogger(WebService.class);

	private Implementacion imp;

	public WebService(Implementacion imp) {
		this.imp = imp;
	}

	// http://localhost:9001/WebService/listar
	@GetMapping(path = "listar")
	public List<Mascota> listar() {
		return imp.listar();
	}

	// http://localhost:9001/WebService/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Mascota mas) {
		imp.guardar(mas);
		return new ResponseEntity<>("Se han guardado los datos de la mascota ", HttpStatus.OK);
	}

	// http://localhost:9001/WebService/editar
	@PostMapping(path = "editar")
	public ResponseEntity<String> editar(@RequestBody Mascota mas) {
		imp.guardar(mas);
		return new ResponseEntity<>("Se han editado los datos de la mascota ", HttpStatus.OK);
	}

	/*
	 * EN ESTE METODO SE DEBE PASAR EL ID PARA IR ELIMINANDO LA CANTIDAD DE LA
	 * MASCOTA
	 * UNA VEZ LLEGADA LA CANTIDAD IGUAL A 0 SE BORRA EL REGISTRO PARA NO TENER
	 * NINGUN ERROR EN LAS CANTIDADES
	 */
	// http://localhost:9001/WebService/eliminar
	@PostMapping(path = "eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Mascota mas) {
		mas = imp.buscar(mas);
		logger.info("Mascota--> {}", mas);
		mas.setCantidad(mas.getCantidad() - 1);

		imp.guardar(mas);

		if (mas.getCantidad() == 0) {
			imp.eliminar(mas);
		}
		return new ResponseEntity<>("Se eliminó la mascota", HttpStatus.OK);
	}

	// http://localhost:9001/WebService/buscar
	@PostMapping(path = "buscar")
	public String buscar(@RequestBody Mascota mas) {
		var lista = imp.buscarNombre(mas);
		for (int i = 0; i < lista.size();) {
			return ("\n Nombre: " + lista.get(i).getNombre() +
					"\n Raza: " + lista.get(i).getRaza() +
					"\n Edad: " + lista.get(i).getEdad() + " años " +
					"\n Cantidad Disponible: " + lista.get(i).getCantidad())
					+ "\n Precio de Venta: " + "$" + lista.get(i).getPrecioVenta();
		}
		return "no se encontro ningún dato";
	}

	/*
	 * EN ESTE METODO SE DEBE PASAR EL ID Y LA FECHA DE NACIMIENTO PARA QUE DEVUELVA
	 * LA EDAD EN AÑOS
	 * POR EJEMPLO SI SE PONE LA FECHA DE ESTE AÑO DARA 0 YA QUE AUN NO CUMPLE EL
	 * AÑO DE EDAD
	 */
	// http://localhost:9001/WebService/edad
	@PostMapping(path = "edad")
	public ResponseEntity<String> edad(@RequestBody Mascota mas) {
		imp.edad(mas);
		return new ResponseEntity<>("Edad de la mascota : " + mas.getEdad() + " años", HttpStatus.OK);
	}

	// http://localhost:9001/WebService/ventas
	@PostMapping(path = "ventas")
	public ResponseEntity<String> ventas(@RequestBody Mascota mas) {
		Mascota m = imp.buscar(mas);

		m.setCantidad(m.getCantidad() - mas.getCantidadVenta());
		logger.info("{}", mas.getCantidad());
		m.setGanancias(m.getCantidadVenta() * mas.getPrecioVenta());
		logger.info("{}", mas.getGanancias());
		m.setCantidadVenta(mas.getCantidadVenta() + m.getCantidadVenta());

		Date fecha = new Date();
		LocalDateTime hoy = LocalDateTime.now();

		logger.info("Esta es la hora actual de venta--->  {}", hoy);
		m.setFechaVenta(fecha);

		if (m.getCantidadVenta() == 0) {
			m.setGanancias(mas.getCantidadVenta() * mas.getPrecioVenta());
		} else {
			m.setGanancias(m.getCantidadVenta() * mas.getPrecioVenta());
		}
		imp.guardar(m);

		return new ResponseEntity<>("Se vendio la mascota con el nombre de " +
				m.getNombre() + " Tipo de mascota " + m.getRaza(), HttpStatus.OK);
	}

}
