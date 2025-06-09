package com.mx.Empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleados.dominio.Employee_worked_hours;
import com.mx.Empleados.respuesta.Respuesta;
import com.mx.Empleados.services.ImpHours;

@RestController
@RequestMapping(path = "hours")
@CrossOrigin
public class HoursWs {
	@Autowired
	ImpHours impHours;
	
	
	@GetMapping(path = "listar")
	public List<Employee_worked_hours> mostrar(){
		return impHours.listar();
	}
	
	@PostMapping(path = "guardar")
	public Respuesta guardar(@RequestBody Employee_worked_hours ewh) {
		return impHours.guardar(ewh);
	}
}
