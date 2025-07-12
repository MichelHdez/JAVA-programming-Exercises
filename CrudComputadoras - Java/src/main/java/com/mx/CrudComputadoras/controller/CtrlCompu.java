package com.mx.CrudComputadoras.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudComputadoras.dao.ComputadorasDao;
import com.mx.CrudComputadoras.dominio.Computadoras;
import com.mx.CrudComputadoras.servicio.Implementacion;

@Controller
@RequestMapping(path = "CtrlCompu")
public class CtrlCompu {

	/*
	 * web service se consume con un front
	 * 
	 * 
	 * web service cuando se sonsume del lado del servidor solo necesitas
	 * -> @Controller
	 * 
	 * Model --> permite crear vista o view o paginas -> java server page
	 */

	@Autowired
	Implementacion imp;
	
	@Autowired
	ComputadorasDao dao;

	// http://localhost:9001/CtrlCompu/listar

	@GetMapping(path = "listar")
	public String listar(Model model) {

		var lista = imp.listar();

		model.addAttribute("lista", lista);

		return "index";
	}

	// guardar --> primero abri el formulario

	// http://localhost:9000/CtrlCompu/abrirGuardar
	@GetMapping(path = "abrirGuardar")
	public String abrirGuardar(Computadoras compu) {

		return "guardar";
	}

	// guardar el objeto
	// http://localhost:9000/CtrlCompu/guardar
	@PostMapping(path = "guardar")
	public String guardar(Computadoras compu) {
		imp.guardar(compu);
		System.out.println("object-->" + compu);
		return "redirect:listar";
	}

	// editar para editar primero hay que buscar

	// http://localhost:9000/CtrlCompu/abrirEditar
	@GetMapping(path = "/abrirEditar/{id}")
	public String abrirEditar(Computadoras compu, Model model) {
		compu = imp.buscar(compu);
		model.addAttribute("compu", compu);
		return "editar";
	}

	// http://localhost:9000/CtrlCompu/editar
	@PostMapping(path = "editar")
	public String editar(Computadoras compu) {
		imp.editar(compu);
		System.out.println("object-->" + compu);
		return "redirect:listar";
	}

	// metodo eliminar
	// http://localhost:9000/CtrlCompu/abrirEliminar
	@GetMapping(path = "/abrirEliminar/{id}")
	public String abrirEliminar(Computadoras compu, Model model) {
		compu = imp.buscar(compu);
		model.addAttribute("compu", compu);
		return "eliminar";
	}

	// http://localhost:9000/CtrlCompu/eliminar
	@PostMapping(path = "eliminar")
	public String eliminar(Computadoras compu) {
		imp.eliminar(compu);
		System.out.println("object-->" + compu);
		return "redirect:listar";
	}

	// metodo eliminar
	// http://localhost:9000/CtrlCompu/abrirEliminar
	@RequestMapping(path = "/abrirEliminarId/{id}")
	public String abrirEliminarId(Computadoras compu, Model model) {
		compu = imp.buscar(compu);
		dao.delete(compu);
		
		var lista = imp.listar();
		model.addAttribute("lista", lista);
		return "index";
	}

}
