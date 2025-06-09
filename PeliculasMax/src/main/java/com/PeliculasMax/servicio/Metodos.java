package com.PeliculasMax.servicio;

import java.util.List;

import com.PeliculasMax.dominio.Peliculas;

public interface Metodos {

	public void guardar(Peliculas pelicula);
	public void editar(Peliculas pelicula);
	public void eliminar(Peliculas pelicula);
	
	public Peliculas buscar(Peliculas pelicula);
	public List<Peliculas> listar();
	public List<Peliculas> buscargenero(Peliculas pelicula);
}
