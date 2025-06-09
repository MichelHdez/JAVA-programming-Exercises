package com.PeliculasMax.controller;

import java.time.LocalDateTime;
import java.util.Date;
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

import com.PeliculasMax.dominio.Peliculas;
import com.PeliculasMax.servicio.Implementacion;

@RestController
@RequestMapping(path="WebService")
@CrossOrigin
public class WebService {

	@Autowired
	Implementacion imp;
	
	// http://localhost:9001/WebService/listar	
	@GetMapping(path="listar")
	public List<Peliculas> listar(){
		return imp.listar();
	}
	
	// http://localhost:9001/WebService/guardar	
	@PostMapping(path="guardar")
	public ResponseEntity<String> guardar(@RequestBody Peliculas pelicula){
		imp.guardar(pelicula);
		return new ResponseEntity<String>("Se ha guardado la película" + pelicula.getNombre(), HttpStatus.OK);
	}
	
	// http://localhost:9001/WebService/editar	
	@PostMapping(path="editar")
	public ResponseEntity<String> editar(@RequestBody Peliculas pelicula){
		imp.guardar(pelicula);
		return new ResponseEntity<String>("Se ha editado la película" + pelicula.getNombre(), HttpStatus.OK);
	}
	
	// http://localhost:9001/WebService/eliminar	
		@PostMapping(path="eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Peliculas pelicula){
			pelicula = imp.buscar(pelicula);
			System.out.println(pelicula.toString());
			pelicula.setCantidad_disponible(pelicula.getCantidad_disponible()-1);
			imp.guardar(pelicula);
			
			if (pelicula.getCantidad_disponible() == 0) {
				imp.eliminar(pelicula); //indice eliminar todo el registro de la BD
			}
			return new ResponseEntity<String>("Se eliminó una copia de la película" + pelicula.getNombre(), HttpStatus.OK);
		}
	
		// http://localhost:9001/WebService/buscar	
		@PostMapping(path="buscar")
		public String buscar(@RequestBody Peliculas pelicula){
			var lista = imp.buscargenero(pelicula);
			for (int i = 0;i < lista.size(); i++) {
				return ("\n Nombre: " +lista.get(i).getNombre()+
						"\n Genero: " +lista.get(i).getGenero()+
						"\n Cantidad Disponible" + lista.get(i).getCantidad_disponible())+
						"\n Precio de Venta: " +lista.get(i).getPrecio_venta();
			}
			return null;
		}
		
		// http://localhost:9001/WebService/ventas	
		@PostMapping(path="ventas")
		public ResponseEntity<String> ventas(@RequestBody Peliculas pelicula){
			Peliculas peli = imp.buscar(pelicula);
//			System.out.println(pelicula.toString());
			System.out.println(peli.getNombre());
			
			peli.setCantidad_disponible(pelicula.getCantidad_disponible()-pelicula.getCantidad_vendidas());
			peli.setGanancias(pelicula.getCantidad_vendidas()*pelicula.getPrecio_venta());
			peli.setCantidad_vendidas(pelicula.getCantidad_vendidas() + peli.getCantidad_vendidas());
			
//			System.out.println(pelicula.getCantidad_vendidas());
			Date fecha = new Date();
			LocalDateTime hoy = LocalDateTime.now();
			System.out.println("Hora actual-->" + hoy);
			
			/*pelicula.setFecha_hora(Date.valueOf(hoy.toLocalDate()));*/
			
			if (peli.getCantidad_vendidas() == 0) {
				peli.setGanancias(pelicula.getGanancias() * pelicula.getPrecio_venta());
			} else {
				peli.setGanancias(peli.getCantidad_vendidas() * pelicula.getPrecio_venta());
			}
			
			imp.guardarPelicula(peli);
//			if (pelicula.getCantidad_disponible() == 0) {
//				imp.eliminar(pelicula); //indice eliminar todo el registro de la BD
//			}
			return new ResponseEntity<String>("Se eliminó una copia de la película" + pelicula.getNombre(), HttpStatus.OK);
		}
		
}
