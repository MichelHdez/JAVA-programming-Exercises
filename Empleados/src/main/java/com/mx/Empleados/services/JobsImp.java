package com.mx.Empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.Empleados.dao.JobsDao;
import com.mx.Empleados.dominio.Employees;
import com.mx.Empleados.dominio.Jobs;
import com.mx.Empleados.respuesta.Respuesta;

@Service
public class JobsImp {
	@Autowired
	JobsDao Jdao;
	
	public Respuesta guardar(Jobs jobs) {
		Respuesta r = new Respuesta();
		List<Jobs> lista = Jdao.findAll();
		int bandera = 0;
		
		for(Jobs j: lista) {
			if(jobs.getId() == j.getId()) {
				r.setMessage("Ya existe un trabajo con este id");
				r.setVericacion(false);
				r.setObj(jobs);
				bandera = 1;
				break;
			} else if (jobs.getName().equals(j.getName())) {
				r.setMessage("El nombre de este puesto ya existe");
				r.setVericacion(false);
				r.setObj(jobs);
				bandera = 1;
				break;
			}
		}
		if(bandera == 0) {
			Jdao.save(jobs);
			r.setMessage("Puesto registrado con exito");
			r.setVericacion(true);
			r.setObj(jobs);
		}
		return r;
	}
	
	
	public Jobs buscar(Jobs jobs) {
		return Jdao.findById(jobs.getId()).orElse(null);
	}
	
	public boolean busca(int id) {
		return Jdao.existsById(id);
	}
	
	public List<Employees> BuscarJobsId (Jobs jobs){
		jobs = Jdao.findById(jobs.getId()).orElse(null);
		List<Employees> lista = jobs.getEmpleadoJobs();	
		return lista;
	}
	
	
	public Respuesta  BuscarJobs (Jobs jobs) {
		List<Jobs> lista = Jdao.findAll();
		Respuesta r = new Respuesta();
		int bandera = 0;
		
		for(Jobs j: lista) {
			if(jobs.getName().equals(j.getName())) {
				jobs = j;
				bandera = 1;
				break;
			}
		}
		if(bandera == 0) {
			r.setMessage("No existen los trabajadores que buscas");
			r.setVericacion(false);
		} else {
			List<Employees> listaE = jobs.getEmpleadoJobs();
			if(listaE.size()== 0) {
				r.setMessage("El puesto tiene estos empleados");
				r.setVericacion(true);
				r.setObj(listaE);
				}  else {
					r.setMessage("El puesto tiene estos empleados");
					r.setVericacion(true);
					r.setObj(listaE);
					//Collections.sort( listaE);
				}
			}
		return r;
	}
}
