package com.mx.Empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleados.dominio.Employees;
import com.mx.Empleados.respuesta.Respuesta;
import com.mx.Empleados.services.ImpEmplo;

@RestController
@RequestMapping(path = "empleado")
@CrossOrigin

public class EmployeeWs {
	@Autowired
	ImpEmplo Imp;
	
	@GetMapping(path = "listar")
	public List<Employees> mostrar(){
		return Imp.mostrar();
	}
	
	@PostMapping(path = "guardar")
	public Respuesta guardar(@RequestBody Employees employees) {
		return Imp.guardar(employees);
	}
	
	
}
