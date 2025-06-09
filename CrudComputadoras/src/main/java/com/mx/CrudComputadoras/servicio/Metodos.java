package com.mx.CrudComputadoras.servicio;

import java.util.List;

import com.mx.CrudComputadoras.dominio.Computadoras;

public interface Metodos {
	
	public void guardar(Computadoras compu);
	public void editar(Computadoras compu);
	public void eliminar(Computadoras compu);
	
	public Computadoras buscar(Computadoras compu);
	public List<Computadoras> listar();

}
