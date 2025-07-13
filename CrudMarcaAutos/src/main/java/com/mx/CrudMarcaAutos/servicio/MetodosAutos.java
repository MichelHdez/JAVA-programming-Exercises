package com.mx.CrudMarcaAutos.servicio;

import java.util.List;

import com.mx.CrudMarcaAutos.dominio.Autos;

public interface MetodosAutos {

	public void guardar(Autos autos);

	public void editar(Autos autos);

	public void eliminar(Autos autos);

	public Autos buscar(Autos autos);

	public List listar();
}
