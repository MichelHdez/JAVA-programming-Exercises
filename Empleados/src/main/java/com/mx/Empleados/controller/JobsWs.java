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
import com.mx.Empleados.dominio.Jobs;
import com.mx.Empleados.respuesta.Respuesta;
import com.mx.Empleados.services.JobsImp;

@RestController
@RequestMapping(path = "jobs")
@CrossOrigin
public class JobsWs {
	@Autowired
	JobsImp imp;
	
	
	@GetMapping("id")
	public List<Employees> buscarId(@RequestBody Jobs jobs){
		List<Employees> lista = imp.BuscarJobsId(jobs);
		return lista;
	}
	
	@PostMapping("guardar")
	public Respuesta guardar(@RequestBody Jobs jobs) {
		return imp.guardar(jobs);
	}
	
	@GetMapping("jobs")
	public Respuesta BuscarJobs(@RequestBody Jobs jobs) {
		return imp.BuscarJobs(jobs);
	}
	
	
}
