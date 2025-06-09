package com.PeliculasMax.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PeliculasMax.dao.PeliculasDao;
import com.PeliculasMax.dominio.Peliculas;

@Service
public class Implementacion implements Metodos{

	@Autowired
	PeliculasDao dao;
	
	
	@Override
	public void guardar(Peliculas pelicula) {
		boolean existe = false;
		for (Peliculas p : listar()) {
			if (p.getNombre().equals(pelicula.getNombre())) {
				System.out.println("La película ya existe");
			existe = true;
		}
	}
		if (!existe) {
			dao.save(pelicula);
		}
}

	@Override
	public void editar(Peliculas pelicula) {
		dao.save(pelicula);
		
	}

	@Override
	public void eliminar(Peliculas pelicula) {
		dao.delete(pelicula);
		
	}

	@Override
	public Peliculas buscar(Peliculas pelicula) {
		return dao.findById(pelicula.getId()).orElse(null);
	}

	//	metodo que retorna la lista de objetos
	@Override
	public List<Peliculas> listar() {
		return (List<Peliculas>) dao.findAll();
	}

	@Override
	public List<Peliculas> buscargenero(Peliculas pelicula) {
		List<Peliculas> lista = new ArrayList<>();
		for (Peliculas p : listar()) {
			if (p.getGenero().equals(pelicula.getGenero())) {
				lista.add(p);
			}
		}
		return lista;
	}
	
	public void guardarPelicula(Peliculas pelicula) {
		dao.save(pelicula);
		
	}

}
