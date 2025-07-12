package com.mx.CrudComputadoras.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudComputadoras.dao.ComputadorasDao;
import com.mx.CrudComputadoras.dominio.Computadoras;

@Service // con esta anotacion le indico a spring que esta clase representa la logica de
			// mi aplicacion
public class Implementacion implements Metodos {

	// inyecion de dependencias -->
	/*
	 * Scopé  permite crear una única instancia de un objeto 
	 * 
	 * @Autowired(ES la inyección de dependencias) creamos un @Bean(clase) carga en
	 * el contenedor de spring  singgleton crea la instancia.
	 * 
	 */
	@Autowired
	ComputadorasDao dao;

	@Override
	public void guardar(Computadoras compu) {
		// TODO Auto-generated method stub
		//
		List<Computadoras> lista = new ArrayList<Computadoras>();
		lista = (List<Computadoras>) dao.findAll();
		if (lista.isEmpty()) {
			dao.save(compu);
		} else {
			for (Computadoras c : lista) {
				if (c.getColor().equals(compu.getColor()) || (c.getId() == compu.getId())) {
					System.out.println("ya existe una computadora");
					return;
				}
			}
			dao.save(compu);
		}
	}

	@Override
	public void editar(Computadoras compu) {
		// TODO Auto-generated method stub
		dao.save(compu);
	}

	@Override
	public void eliminar(Computadoras compu) {
		// TODO Auto-generated method stub
		dao.delete(compu);
	}

	public void eliminarId(int id) {
		// TODO Auto-generated method stub

		dao.deleteById(id);

	}

	@Override
	public Computadoras buscar(Computadoras compu) {
		// TODO Auto-generated method stub
		compu = dao.findById(compu.getId()).orElse(null);
		return compu;
	}

	public List<Computadoras> buscarXatributo(Computadoras compu) {
		// TODO Auto-generated method stub
		List<Computadoras> lista = new ArrayList<Computadoras>();

		for (Computadoras c : dao.findAll()) {
			if (c.getMarca().equals(compu.getMarca())) {
				lista.add(c);
			}
			if (c.getModelo().equals(compu.getModelo())) {
				lista.add(c);
			}
			if (c.getPrecio() == compu.getPrecio()) {
				lista.add(c);
			}
		}

		return lista;
	}

	@Override
	public List<Computadoras> listar() {
		// TODO Auto-generated method stub

		return (List<Computadoras>) dao.findAll();
	}

	// eliminr por cuqluier atributo

	public void eliminarXatributo(Computadoras compu) {
		// TODO Auto-generated method stub

		for (Computadoras c : dao.findAll()) {
			if (c.getMarca().equals(compu.getMarca())) {
				dao.delete(c);
			}
			if (c.getModelo().equals(compu.getModelo())) {
				dao.delete(c);
			}
			if (c.getPrecio() == compu.getPrecio()) {
				dao.delete(c);
			}
		}

	}
}
