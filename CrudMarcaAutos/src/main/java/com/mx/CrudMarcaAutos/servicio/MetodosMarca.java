package com.mx.CrudMarcaAutos.servicio;

import java.util.List;

import com.mx.CrudMarcaAutos.dominio.Marca;

public interface MetodosMarca{

	public void guardar(Marca marca);

	public void editar(Marca marca);

	public void eliminar(Marca marca);

	public Marca buscar(Marca marca);

	public List listar();
	
}
