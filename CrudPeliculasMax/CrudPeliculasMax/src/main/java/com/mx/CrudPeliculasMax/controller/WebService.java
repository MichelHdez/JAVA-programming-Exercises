package com.mx.CrudPeliculasMax.controller;


import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudPeliculasMax.dominio.Peliculas;
import com.mx.CrudPeliculasMax.servicio.Implementacion;

@RestController
@RequestMapping(path = "WebService")
@CrossOrigin("*")
public class WebService {

	@Autowired
	Implementacion imp;

	// http://localhost:9001/WebService/listar
	@GetMapping(path = "listar")
	public List<Peliculas> listar() {
		return imp.listar();
	}

	// http://localhost:9001/WebService/guardar
	@RequestMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Peliculas pelicula) {
		imp.guardar(pelicula);
		return new ResponseEntity<String>("Se guado la pelicula: " + pelicula.getNombre(), HttpStatus.CREATED);
	}

	// http://localhost:9001/WebService/editar
	@RequestMapping(path = "editar")
	public ResponseEntity<String> editar(@RequestBody Peliculas pelicula) {
		imp.editar(pelicula);
		return new ResponseEntity<String>("Se edito la pelicula: " + pelicula.getNombre(), HttpStatus.CREATED);
	}

	// http://localhost:9001/WebService/eliminar
	@RequestMapping(path = "eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Peliculas pelicula) {
		// imp.eliminar(pelicula);
		pelicula = imp.buscar(pelicula);
		System.out.println("PElicula->" + pelicula.toString());
		pelicula.setCantidad_disponible(pelicula.getCantidad_disponible() - 1);
		imp.guardar(pelicula);
		if (pelicula.getCantidad_disponible() == 0) {
			imp.eliminar(pelicula); // indice elimina todo el registro de la bd
		}

		return new ResponseEntity<String>("Se elimino la pelicula: " + pelicula.getNombre(), HttpStatus.CREATED);
	}

	// http://localhost:9001/WebService/buscar
	@RequestMapping(path = "buscar")
	public String buscar(@RequestBody Peliculas pelicula) {
		var lista = imp.buscarGenero(pelicula);
		for (int i = 0; i < lista.size(); i++) {
			return ("\n Nombre: " + lista.get(i).getNombre() + "\n Genero: " + lista.get(i).getGenero()
					+ "\n Cantidad disponible: " + lista.get(i).getCantidad_disponible() + "\n Precio: "
					+ lista.get(i).getPrecio_venta());
		}
		return null;
	}

	// http://localhost:9001/WebService/ventas
	@RequestMapping(path = "ventas")
	public ResponseEntity<String> ventas(@RequestBody Peliculas pelicula) {
		// imp.eliminar(pelicula);
		 Peliculas peli = imp.buscar(pelicula);
		System.out.println("Pelicula->" + peli.getNombre());
		
		peli.setCantidad_disponible(peli.getCantidad_disponible()- pelicula.getCantidad_vendidas());
		peli.setGanancias(peli.getCantidad_vendidas()*pelicula.getPrecio_venta());
		peli.setCantidad_vendidas(pelicula.getCantidad_vendidas() + peli.getCantidad_vendidas());
		
		Date fecha = new Date();
		LocalDateTime hoyDateTime = LocalDateTime.now();
		
		System.out.println("Hora Actual->"+hoyDateTime);
		//peli.setFecha_hora(Date.valueOf(hoyDateTime.toLocalDate()));

		peli.setFecha_hora(fecha);
		
		
	    if(peli.getCantidad_vendidas() == 0) {
	    	peli.setGanancias(pelicula.getCantidad_vendidas()*pelicula.getPrecio_venta());
	    }else {
	    	peli.setGanancias(peli.getCantidad_vendidas() * pelicula.getPrecio_venta());
	    }
	    imp.guardarPelicula(peli);
		
		
				

		return new ResponseEntity<String>("Se vendio  la pelicula: " + pelicula.getNombre(), HttpStatus.CREATED);
	}
}
