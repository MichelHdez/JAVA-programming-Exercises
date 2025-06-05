package com.mx.CrudOpticas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudOpticas.dominio.Opticas;
import com.mx.CrudOpticas.servicio.Implementacion;

@RestController
@RequestMapping(path="WebService/Api")
@CrossOrigin("*")
public class WebService {

	/*
	 * @RestController define una clase como una webService de tipo rest y permite marca como controlador
	 * de solicitudes -> hhtp get , post, delete, put, view etc
	 * 
	 * @RequestMapping("WebService") se utiliza para asiganr solicitudes we a los metodos de 
	 * spring controller
	 * 
	 * @CrossOrigin("*") es de seguridad permite restringir los recursos implementados en los navegadores
	 * por razonaes de seguridad a los navegadores no permiten realizar solicitudes ajax a recursos
	 * que esatn fuera de su origen actual --> MVC
	 */
	
	//Inyeccion de dependencias
	@Autowired
	Implementacion imp;
	
	// URL :
		//http://localhost:9001/WebService/Api/lista
		@GetMapping(path="lista")
		public List<Opticas> lista(){
			List<Opticas> listaOptic = new ArrayList<Opticas>();
			listaOptic = imp.listar();
			
			return listaOptic;
		}
		
		//http://localhost:9001/WebService/Api/ganacias
		/*
		 * @GetMapping(path="ganancias") public String ganacias(){ List<Opticas>
		 * listaOptic = new ArrayList<Opticas>(); listaOptic = imp.listar();
		 * 
		 * double ganancias = 0; for (Opticas c : listaOptic) { ganancias +=
		 * c.getPrecio(); System.out.println("Ganancias"+ganancias);
		 * 
		 * } return ("ganacias: "+ganancias); }
		 */
		
		//http://localhost:9001/WebService/Api/guardar
		//metodo guardar
		@PostMapping(path="guardar")
		public void guardar(@RequestBody Opticas optic) {
			imp.guardar(optic);
			
		}
		
		//http://localhost.com:9001/WebService/Api/editar
		//metodo editar
		@PostMapping(path="editar")
		public void editar(@RequestBody Opticas optic) {
			imp.editar(optic);
			
		}
		
		//http://localhost.com:9001/WebService/eliminar
		//metodo eliminar
		@PostMapping(path="eliminar")
		public void eliminar( @RequestBody Opticas optic) {
			imp.eliminar(optic);
			
		}
		
		//http://localhost.com:9001/WebService/Api/buscar
		//metodo buscar
		@PostMapping(path="buscar")
		public Opticas buscar(@RequestBody Opticas optic) {
			optic = imp.buscar(optic);

			return optic;
		}
}
