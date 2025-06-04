package com.celulares.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.celulares.dao.CelularesDao;
import com.celulares.dominio.Celulares;
import com.celulares.servicio.Implementacion;

@Controller
@RequestMapping(path = "CtrlCel")
public class CtrlCel {

	private Logger logger = LoggerFactory.getLogger(CtrlCel.class);

	private Implementacion imp;

	private CelularesDao dao;

	public CtrlCel(Implementacion imp, CelularesDao dao){
		this.imp = imp;
		this.dao = dao;
	}

	// http://localhost:9001/CtrlCompu/listar

	@GetMapping(path = "listar")
	public String listar(Model model) {
		var lista = imp.listar();
		model.addAttribute("lista", lista);
		return "index";
	}

	// guardar --> primero abri el formulario

	// http://localhost:9001/CtrlCompu/abrirGuardar
	@GetMapping(path = "abrirGuardar")
	public String abrirGuardar(Celulares cel) {
		return "guardar";
	}

	// guardar el objeto
	// http://localhost:9001/CtrlCompu/guardar
	@PostMapping(path = "guardar")
	public String guardar(Celulares cel) {
		imp.guardar(cel);
		logger.info("object-->" + cel);
		return "redirect:listar";
	}

	// editar para editar primero hay que buscar

	// http://localhost:9001/CtrlCompu/abrirEditar
	@GetMapping(path = "/abrirEditar/{id}")
	public String abrirEditar(Celulares cel, Model model) {
		cel = imp.buscar(cel);
		model.addAttribute("compu", cel);
		return "editar";
	}

	// http://localhost:9001/CtrlCompu/editar
	@PostMapping(path = "editar")
	public String editar(Celulares cel) {
		imp.editar(cel);
		System.out.println("object-->" + cel);
		return "redirect:listar";
	}

	// metodo eliminar
	// http://localhost:9001/CtrlCompu/abrirEliminar
	@GetMapping(path = "/abrirEliminar/{id}")
	public String abrirEliminar(Celulares cel, Model model) {
		cel = imp.buscar(cel);
		model.addAttribute("compu", cel);
		return "eliminar";
	}

	// http://localhost:9001/CtrlCompu/eliminar
	@PostMapping(path = "eliminar")
	public String eliminar(Celulares cel) {
		imp.eliminar(cel);
		logger.info("object-->" + cel);
		return "redirect:listar";
	}

	// metodo eliminar
	// http://localhost:9001/CtrlCompu/abrirEliminar
	@RequestMapping(path = "/abrirEliminarId/{id}")
	public String abrirEliminarId(Celulares cel, Model model) {
		cel = imp.buscar(cel);
		dao.delete(cel);

		var lista = imp.listar();
		model.addAttribute("lista", lista);
		return "index";
	}
}
