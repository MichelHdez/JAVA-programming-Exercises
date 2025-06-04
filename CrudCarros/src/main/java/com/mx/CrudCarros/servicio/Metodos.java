package com.mx.CrudCarros.servicio;

import java.util.List;

import com.mx.CrudCarros.dominio.Carros;

public interface Metodos {
	public void guardar(Carros carro);

	public void editar(Carros carro);

	public void eliminar(Carros carro);

	public Carros buscar(Carros carro);

	public List<Carros> listar();

	// Metodos Personalizados
	public List<Carros> buscarXNombre(Carros carro);

	public Carros buscarXAtributo(Carros carro);

	public Carros elimiXNombre(Carros carro);

}
