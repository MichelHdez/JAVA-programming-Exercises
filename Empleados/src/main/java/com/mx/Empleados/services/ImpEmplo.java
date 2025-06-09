package com.mx.Empleados.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Empleados.dao.EmpleadosDao;
import com.mx.Empleados.dominio.Employees;
import com.mx.Empleados.respuesta.Respuesta;

@Service
public class ImpEmplo {
	@Autowired
	EmpleadosDao Edao;
	
	@Autowired
	JobsImp Jimp;
	
	public Respuesta guardar(Employees employees) {
		Respuesta r = new Respuesta();
		List<Employees> lista = Edao.findAll();
		boolean jobs = Jimp.busca(employees.getJobs().getId());
		int bandera = 0;
		
		LocalDate hoy = LocalDate.now();
		LocalDate nacimiento = employees.getCumpleanos().toLocalDate();
		long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
		
		if(edad < 18) {
			r.setMessage("El empleado es menor de edad");
			r.setObj(employees);
			bandera = 1;
		} else {
			for(Employees e : lista) {
				if(employees.getId() == e.getId()) {
					r.setMessage("El id ya existe");
					r.setObj(employees);
					r.setVericacion(false);
					bandera = 1;
					break;
				} else if(employees.getName().equals(e.getName())) {
					if(employees.getLas_name().equals(e.getLas_name())) {
						r.setMessage("Nombre y apellido ya estan registrados");
						r.setObj(employees);
						r.setVericacion(false);
						bandera = 1;
						break;
					}
				}
			}
		
			
		}
			if (!jobs) {
					r.setVericacion(false);
					r.setMessage("No existe el trabajo con ese Id");
					bandera =1;	
				}

		if(bandera == 0) {
			Edao.save(employees);
			r.setMessage("Empleado registrado");
			r.setVericacion(true);
			r.setObj(employees);
		}
		return r;
	}
	
	
	public List<Employees> mostrar(){
		List<Employees> lista = Edao.findAll();
		return lista;
	}
	
	
	public boolean busca(int id) {
		return Edao.existsById(id);
	}
	
	
	
	
	
	
		
	
	
	
}
