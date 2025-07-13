package com.mx.pacientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pacientes.dao.DoctorDao;
import com.mx.pacientes.entidad.Doctor;
import com.mx.pacientes.entidad.Pacientes;
@Service
public class ImpDoctor  implements DoctorMet{

	@Autowired
	DoctorDao dao;
	
	@Override
	public List<Doctor> lista() {
		return dao.findAll();
	}

	@Override
	public void guardar(Doctor doctor) {

		List<Doctor> lista = dao.findAll();
		for(Doctor d : lista) {
			if(d.getNombre().equals(doctor.getNombre())) {
				System.out.println("Nombre repetido");
			}
			dao.save(doctor);

		}
		
	}

	@Override
	public void editar(Doctor doctor) {
		// TODO Auto-generated method stub
		dao.save(doctor);
		
	}

	@Override
	public void eliminar(Doctor doctor) {
		// TODO Auto-generated method stub
		dao.delete(doctor);
		
	}

	@Override
	public Doctor buscar(Doctor doctor) {
		// TODO Auto-generated method stub
		return dao.findById(doctor.getId()).orElse(null);
	}
	
	public Doctor buscarXnombre(String nombre) {
		return dao.findByNombre(nombre);
	}
	
	public Doctor buscarXatributo(Doctor doctor) {
		Doctor p = null;
		if(doctor.getNombre() != null) {
			p = dao.findByNombre(doctor.getNombre());
		}else {
			System.out.println("No existe el elemento");
		}
		return p;
	}
	

}
