package com.mx.CrudEmpleados.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleados.dao.EmpleadoDao;
import com.mx.CrudEmpleados.dominio.Empleado;

@Service
public class Implementacion implements Metodos {

	/*
	 * se crea un bean es una clase que entra en el core de spring ese bean lo
	 * trabaja el scope de singleton se va a apoyar del ambito singleton este va a
	 * crear una unica instancia en el conteiner de spring esto hace qwue tu ni
	 * inicialices objetos: empleado = new Empleado();--> esto es lo que evita
	 * singbleton crea una unica insatancia
	 */
	@Autowired // inyeccion de la dependecia
	EmpleadoDao dao;

	@Override
	public Empleado guadar(Empleado empleado) {
		// TODO Auto-generated method stub
		return dao.save(empleado);
	}

	@Override
	public Empleado ediitar(Empleado empleado) {
		// TODO Auto-generated method stub
		return dao.save(empleado);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Empleado buscarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElseThrow(() -> new RuntimeException("no existe el empleado"));
	}

	public Empleado buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return dao.findByNombre(nombre);
	}

	@Override
	public Empleado buscarNombre(Empleado empleado) {
		// TODO Auto-generated method stub
		Empleado em = new Empleado();
		if (empleado.getNombre() != null) {
			em = dao.findByNombre(empleado.getNombre());
		}
		return em;
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
