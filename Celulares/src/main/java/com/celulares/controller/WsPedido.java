package com.celulares.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celulares.dao.PedidosDao;
import com.celulares.dominio.Pedido;

@RestController
@RequestMapping(path = "WsPedido")
@CrossOrigin("*")
public class WsPedido {

	private PedidosDao dao;

	public WsPedido(PedidosDao dao) {
		this.dao = dao;
	}

	// http://localhost:9001/WsPedido/guardar
	@PostMapping(path = "guardar")
	public Pedido guardar(@RequestBody Pedido pedido) {
		return dao.save(pedido);
	}

	// http://localhost:9001/WsPedido/listar
	@GetMapping(path = "listar")
	public List<Pedido> listar() {
		return (List<Pedido>) dao.findAll();
	}

}
