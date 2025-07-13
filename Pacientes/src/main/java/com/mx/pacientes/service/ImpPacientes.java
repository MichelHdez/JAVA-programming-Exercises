package com.mx.pacientes.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pacientes.dao.PacientesDao;
import com.mx.pacientes.entidad.Pacientes;
@Service
public class ImpPacientes implements PacientesMet{

	@Autowired
	PacientesDao dao;
	
	@Override
	public List<Pacientes> lista() {
		return dao.findAll();
	}

	@Override
	public void guardar(Pacientes pacientes) {
		List<Pacientes> lista = dao.findAll();

		if(lista.isEmpty()) {
			LocalDate hoy = LocalDate.now();
			Period p = Period.between(pacientes.getFecha_nacimiento(), hoy);
			int e = p.getYears();
			pacientes.setEdad(e);
			
				if(pacientes.getEnfermedad().equals("FIEBRE") || pacientes.getEnfermedad().equals("COVID")) {
					if(pacientes.getTipo_sangre().equals("O-POSITIVO") || pacientes.getTipo_sangre().equals("O-NEGATIVO")) {
						dao.save(pacientes);

					}
				}
			
		}else {
			LocalDate hoy = LocalDate.now();
			Period p = Period.between(pacientes.getFecha_nacimiento(), hoy);
			int e = p.getYears();
			pacientes.setEdad(e);
			if((pacientes.getEdad()>10) && (pacientes.getEdad()<=30)) {
				if(pacientes.getEnfermedad().equals("FIEBRE") || pacientes.getEnfermedad().equals("COVID")) {
					if(pacientes.getTipo_sangre().equals("O-POSITIVO") || pacientes.getTipo_sangre().equals("O-NEGATIVO")) {
						dao.save(pacientes);

					}
				}
			}

			
		}

	}

	@Override
	public void editar(Pacientes pacientes) {
		dao.save(pacientes);
				
	}

	@Override
	public void eliminar(Pacientes pacientes) {
		
		List<Pacientes> lista = dao.findAll();
		for(Pacientes p : lista) {
			if(p.getNombre().equals(pacientes.getNombre())) {
				dao.delete(p);
			}
		}
		
	}

	@Override
	public Pacientes buscar(Pacientes pacientes) {

		// TODO Auto-generated method stub
		return dao.findById(pacientes.getId()).orElse(null);
	}

	@Override
	public Pacientes findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

	public Pacientes buscarXatributo(Pacientes pacientes) {
		Pacientes p = null;
		if(pacientes.getNombre() != null) {
			p = dao.findByNombre(pacientes.getNombre());
		}else {
			System.out.println("No existe el elemento");
		}
		return p;
	}
	
	
}
