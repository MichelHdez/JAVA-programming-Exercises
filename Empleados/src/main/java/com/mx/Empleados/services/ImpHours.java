package com.mx.Empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Empleados.dao.HoursDao;
import com.mx.Empleados.dominio.Employee_worked_hours;
import com.mx.Empleados.respuesta.Respuesta;

@Service
public class ImpHours {
	@Autowired
	HoursDao hours;
	
	@Autowired
	ImpEmplo imp;
	
	public List<Employee_worked_hours> listar(){
		return hours.findAll();
	}
	
	public Respuesta guardar(Employee_worked_hours ewh) {
		Respuesta r = new Respuesta();
		r.setVericacion(true);
		
		if(hours.existsById(ewh.getId())) {
			r.setMessage("Ya existe un id en el registro");
			r.setVericacion(false);
		}
		if(!imp.busca(ewh.getEmployee().getId())) {
			r.setMessage("No existe este empleado con ese id");
			r.setVericacion(false);
		}
		
		if (r.isVericacion()) {
			hours.save(ewh);
			r.setMessage("Registro guardado");
			r.setVericacion(true);
		}
		return r;
	}
}
