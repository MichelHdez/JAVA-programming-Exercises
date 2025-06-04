package com.bebidas.servicios;

import java.util.List;

import com.bebidas.entidad.Bebidas;

public interface BebidasServ {

	public void guardar(Bebidas bebida);
	public void editar(Bebidas bebida);
	public void eliminar(Bebidas bebida);
	
	public Bebidas buscar(Bebidas bebida);
	public Bebidas buscarXAtributo(Bebidas bebida);
	
	public List<Bebidas> listar();
	public List<Bebidas> listarXatributo(Bebidas bebida);
}
