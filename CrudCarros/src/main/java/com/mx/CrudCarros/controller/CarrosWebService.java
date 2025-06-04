package com.mx.CrudCarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudCarros.dominio.Carros;
import com.mx.CrudCarros.servicio.CarrosServImp;



@RestController
@RequestMapping("CarrosWebService")
@CrossOrigin
public class CarrosWebService {
@Autowired
CarrosServImp carrosServImp;

//listar
//http://localhost:9001/CarrosWebService/listar
@GetMapping("listar")
public List<Carros> listar(){
	return carrosServImp.listar();
}

//guardar
//http://localhost:9001/CarrosWebService/guardar
@PostMapping("guardar")
public void guardar(@RequestBody Carros carro) {
	carrosServImp.guardar(carro);
}

//editar
//http://localhost:9001/CarrosWebService/editar
@PostMapping("editar")
public void editar(@RequestBody Carros carro) {
	carrosServImp.editar(carro);
}
//eliminar
//http://localhost:9001/CarrosWebService/eliminar
@PostMapping("eliminar")
public void eliminar(@RequestBody Carros carro) {
	carrosServImp.eliminar(carro);
	
}
//buscar
//http://localhost:9001/CarrosWebService/buscar
@PostMapping("buscar")
public Carros buscar(@RequestBody Carros carro) {
	
	return carrosServImp.buscar(carro);
}
//buscarXnombre
//http://localhost:9001/CarrosWebService/listarNombre
@GetMapping("listarNombre")
public List<Carros> listaNombre(@RequestBody Carros carro){
	
	var lista = carrosServImp.buscarXNombre(carro);
	return lista;
}

//buscarAtributo
//http://localhost:9001/CarrosWebService/buscarAtributo
@GetMapping("buscarAtributo")
public Carros buscarAtributo(@RequestBody Carros carro) {
	return carrosServImp.buscarXAtributo(carro);
}

//eliminarNombre
//http://localhost:9001/CarrosWebService/eliminarNombre
@PostMapping("eliminarNombre")
public Carros eliminarNombre(@RequestBody Carros carro) {
	return carrosServImp.elimiXNombre(carro);
}

}
