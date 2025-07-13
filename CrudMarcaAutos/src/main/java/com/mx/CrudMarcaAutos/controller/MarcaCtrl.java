package com.mx.CrudMarcaAutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudMarcaAutos.dominio.Marca;
import com.mx.CrudMarcaAutos.servicio.MetodosMarca;

@Controller
@RequestMapping("MarcaCtrl")
public class MarcaCtrl {
		@Autowired
		MetodosMarca metodos;
		
		@GetMapping("inicio")
		public String inicio(Model model) {
			var lista = metodos.listar();
			System.out.println("lista-->" +lista);
			model.addAttribute("lista", lista);
			return "index";
		}
		
		@GetMapping("abrirGuardar")
		public String abrirGuardar(Marca marca) {
			return "agregar";
		}
		
		@PostMapping("guardar")
		public String guardar(Marca marca) {
			metodos.guardar(marca);
			return "redirect:/MarcaCtrl/inicio";
		}
		
		@GetMapping("/abrirEditar/{id}")
		public String abrirEditar(Marca marca, Model model) {
			marca = metodos.buscar(marca);
			model.addAttribute("marca", marca);
			return "editar";
		}
		
		@PostMapping("editar")
		public String editar(Marca marca) {
			metodos.editar(marca);
			return "redirect:/MarcaCtrl/inicio";
		}//editar
		
		@GetMapping("/abrirEliminar/{id}")
		public String abrirEliminar(Marca marca, Model model) {
			marca = metodos.buscar(marca);
			model.addAttribute("marca", marca);
			return "eliminar";
		}//eliminar
		
		@PostMapping("eliminar")
		public String eliminar(Marca marca) {
			metodos.eliminar(marca);
			return "redirect:/MarcaCtrl/inicio";
		}
	
}
