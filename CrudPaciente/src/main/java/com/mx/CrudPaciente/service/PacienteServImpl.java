package com.mx.CrudPaciente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudPaciente.dao.PacienteDao;
import com.mx.CrudPaciente.dominio.Paciente;

@Service
public class PacienteServImpl implements PacienteServ {

	@Autowired
	PacienteDao pacienteDao;

	@Override
	public void guardar(Paciente paciente) {
		List<Paciente> lista = (List<Paciente>) pacienteDao.findAll();
		if (lista.isEmpty()) {
			pacienteDao.save(paciente);
		} else {
			for (Paciente pac : lista) {
				if ((pac.getNombre().equals(paciente.getNombre())) && (pac.getApp()).equals(paciente.getApp())) {
					System.out.println("El paciente ya existe");
				}
			}
				pacienteDao.save(paciente);
		}
	}

	public void guardarXenfermedad(Paciente paciente) {
		List<Paciente> lista = (List<Paciente>) pacienteDao.findAll();
		if (lista.isEmpty()) {
			pacienteDao.save(paciente);
		} else {
			for (Paciente pac : lista) {
				if ((pac.getTipo_enfermedad().equals(paciente.getTipo_enfermedad()))
						&& (pac.getTipo_sangre()).equals(paciente.getTipo_sangre())) {
					System.out.println("El paciente ya existe");
				}
			}

		}
	}

	@Override
	public void editar(Paciente paciente) {
		List<Paciente> lista = (List<Paciente>) pacienteDao.findAll();
		if (lista.isEmpty()) {
			System.out.println("No existe elementos a editar");
		} else {
			pacienteDao.save(paciente);
		}

	}

	@Override
	public void eliminar(Paciente paciente) {
		List<Paciente> lista = (List<Paciente>) pacienteDao.findAll();
		if (lista.isEmpty()) {
			System.out.println("No existe elementos a eliminar");
		}  else {
			pacienteDao.delete(paciente);
		}
		

	}

	@Override
	public Paciente buscar(Paciente paciente) {
		// TODO Auto-generated method stub
		return pacienteDao.findById(paciente.getId()).orElseThrow(()->new RuntimeException("No se encontro Paciente")) ;
	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return (List<Paciente>)pacienteDao.findAll();
	}

	@Override
	public Paciente buscarXNombre(Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarXApellido(Paciente paciente) {
		// TODO Auto-generated method stub

	}

}
