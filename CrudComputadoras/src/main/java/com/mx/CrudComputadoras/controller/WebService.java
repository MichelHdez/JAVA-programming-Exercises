package com.mx.CrudComputadoras.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudComputadoras.dao.ComputadorasDao;
import com.mx.CrudComputadoras.dominio.Computadoras;
import com.mx.CrudComputadoras.servicio.Implementacion;

@RestController
@RequestMapping(path = "WebService/Api")
@CrossOrigin("*")
public class WebService {

	/*
	 * @RestController define una clase como una web service de tipo rest y
	 * ´permite marca como controlador de solicitudes -> http get, post, delete,
	 * put, view etc
	 * 
	 * @RequestMapping("WebService") se utiliza para asignar solicutudes web a los
	 * metodos de spring controller
	 * 
	 * @CrossOrigin("*") es de seguridad permite restringir los recursos
	 * implemenetados en los navegadores por razanes de sguridad los navegadores no
	 * permiten realizar solicitudes ajax a recursos que estan fuera de su origen
	 * actual --> MVC
	 * 
	 */

	// inyecion de dependencias
	@Autowired
	Implementacion imp;
	// URL : url del servidor + el path de mi clase + el path de mi metodo

	@Autowired
	ComputadorasDao dao;

	// http://localhost:9000/WebService/Api/listaDao
	@GetMapping(path = "listaDao")
	public List<Computadoras> listaDao() {
		
		return (List<Computadoras>) dao.findAll();
	}

	// http://localhost:9000/WebService/Api/lista
	@GetMapping(path = "lista")
	public List<Computadoras> lista() {
		List<Computadoras> listaCompu = new ArrayList<Computadoras>();
		listaCompu = imp.listar();
		return listaCompu;
	}

	// http://localhost:9000/WebService/Api/ganacias
	@GetMapping(path = "ganacias")
	public String ganacias() {
		List<Computadoras> listaCompu = new ArrayList<Computadoras>();
		listaCompu = imp.listar();

		double ganancias = 0;
		for (Computadoras c : listaCompu) {
			ganancias += c.getPrecio();
			System.out.println("Ganacias" + ganancias);
			break;
		}
		return ("ganancias: " + ganancias);
	}

	// http://localhost:9000/WebService/Api/guardar
	// metodo guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Computadoras compu) {
		imp.guardar(compu);
		// @RequestBody -> convetir un objeto en JSON
	}

	// http://localhost:9000/WebService/Api/editar
	// metodo EDITAR
	@PostMapping(path = "editar")
	public void editar(@RequestBody Computadoras compu) {
		imp.editar(compu);
		// @RequestBody -> convetir un objeto en JSON
	}

	// http://localhost:9000/WebService/eliminar
	// metodo Eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Computadoras compu) {
		imp.eliminar(compu);
		// @RequestBody -> convetir un objeto en JSON
	}

	// http://localhost:9000/WebService/Api/eliminarXatributo
	// metodo Eliminar
	@PostMapping(path = "eliminarXatributo")
	public void eliminarXatributo(@RequestBody Computadoras compu) {
		imp.eliminarXatributo(compu);
		// @RequestBody -> convetir un objeto en JSON
	}

	// http://localhost:9000/WebService/Api/buscar
	// metodo Eliminar
	@PostMapping(path = "buscar")
	public Computadoras buscar(@RequestBody Computadoras compu) {

		compu = imp.buscar(compu);

		return compu;
	}

	// http://localhost:9000/WebService/Api/buscarXatributo
	@PostMapping(path = "buscarXatributo")
	public List<Computadoras> buscarXatributo(@RequestBody Computadoras compu) {

		var lista = imp.buscarXatributo(compu);

		return lista;
	}

	// front --> html css java script y jquery
}
