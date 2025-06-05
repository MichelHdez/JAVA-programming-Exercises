package com.mx.CrudPeliculasMax.servicio;

import java.util.List;

import com.mx.CrudPeliculasMax.dominio.Peliculas;

public interface Metodos {
	
	public void guardar(Peliculas pelicula);
	public void editar(Peliculas pelicula);
	public void eliminar(Peliculas pelicula);
	
	public Peliculas buscar(Peliculas pelicula);
	public List<Peliculas> listar();
	public List<Peliculas> buscarGenero(Peliculas pelicula);
	
	

}
