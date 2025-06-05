package com.mx.CrudPeliculasMax.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudPeliculasMax.dao.PeliculasDao;
import com.mx.CrudPeliculasMax.dominio.Peliculas;

@Service
public class Implementacion implements Metodos {

	@Autowired
	PeliculasDao dao;

	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub

		boolean existe = true;
		for (Peliculas p : listar()) {
			if (p.getNombre().equals(pelicula.getNombre())) {
				System.out.println("LA pelicula ya existe");
				existe = true;
			}
		}
		if (!existe) {
			dao.save(pelicula);
		}

	}

	public void guardarPelicula(Peliculas pelicula) {
		dao.save(pelicula);
	}

	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}

	@Override
	public void eliminar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.delete(pelicula);
	}

	@Override
	public Peliculas buscar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return dao.findById(pelicula.getId()).orElse(pelicula);
	}

	// tengo el metodos que me retorna la lista de objet
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return (List<Peliculas>) dao.findAll();
	}

	@Override
	public List<Peliculas> buscarGenero(Peliculas pelicula) {
		// TODO Auto-generated method stub
		List<Peliculas> lista = new ArrayList<>();
		for (Peliculas p : listar()) {
			if (p.getGenero().equals(pelicula.getGenero())) {
				lista.add(p);
			}
		}
		return lista;
	}

}
