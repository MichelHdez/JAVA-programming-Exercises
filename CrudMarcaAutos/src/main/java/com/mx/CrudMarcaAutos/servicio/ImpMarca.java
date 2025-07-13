package com.mx.CrudMarcaAutos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudMarcaAutos.dao.MarcaDao;
import com.mx.CrudMarcaAutos.dominio.Marca;

@Service
public class ImpMarca implements MetodosMarca{

	@Autowired
	MarcaDao dao;
	
	@Override
	public void guardar(Marca marca) {
		dao.save(marca);
		
	}

	@Override
	public void editar(Marca marca) {
		dao.save(marca);
		
	}

	@Override
	public void eliminar(Marca marca) {
		dao.delete(marca);
		
	}

	@Override
	public Marca buscar(Marca marca) {
		return dao.findById(marca.getId()).orElseThrow();
	}

	@Override
	public List listar() {
		return (List) dao.findAll();
	}

}
