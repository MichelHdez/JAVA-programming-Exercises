package com.celulares.servicio;

import java.util.List;

import com.celulares.dominio.Celulares;

public interface Metodos {

	public void guardar(Celulares cel);

	public void editar(Celulares cel);

	public void eliminar(Celulares cel);

	public Celulares buscar(Celulares cel);

	public List<Celulares> listar();

}
