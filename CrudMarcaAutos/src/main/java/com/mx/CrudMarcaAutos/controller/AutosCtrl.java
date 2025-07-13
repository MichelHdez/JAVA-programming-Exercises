package com.mx.CrudMarcaAutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudMarcaAutos.dominio.Autos;
import com.mx.CrudMarcaAutos.servicio.MetodosAutos;

@Controller
@RequestMapping("AutosCtrl")
public class AutosCtrl {

		@Autowired
		MetodosAutos metodos;
		
		@GetMapping("inicio")
		public String inicio(Model model) {
			var lista = metodos.listar();
			System.out.println("lista-->" +lista);
			model.addAttribute("lista", lista);
			return "index";
		}
		
		@GetMapping("abrirGuardar")
		public String abrirGuardar(Autos autos) {
			return "agregar";
		}
		
		@PostMapping("guardar")
		public String guardar(Autos autos) {
			metodos.guardar(autos);
			return "redirect:/AutosCtrl/inicio";
		}
		
		@GetMapping("/abrirEditar/{id}")
		public String abrirEditar(Autos autos, Model model) {
			autos = metodos.buscar(autos);
			model.addAttribute("autos", autos);
			return "editar";
		}
		
		@PostMapping("editar")
		public String editar(Autos autos) {
			metodos.editar(autos);
			return "redirect:/AutosCtrl/inicio";
		}//editar
		
		@GetMapping("/abrirEliminar/{id}")
		public String abrirEliminar(Autos autos, Model model) {
			autos = metodos.buscar(autos);
			model.addAttribute("autos", autos);
			return "eliminar";
		}//eliminar
		
		@PostMapping("eliminar")
		public String eliminar(Autos autos) {
			metodos.eliminar(autos);
			return "redirect:/AutosCtrl/inicio";
		}
	
}
