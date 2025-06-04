package com.Autos.servicio;

import java.util.List;

import com.Autos.dominio.Autos;

public interface Metodos {
	public void guardar(Autos a);

	public void editar(Autos a);

	public void eliminar(Autos a);

	public Autos buscar(Autos a);

	public List<Autos> listar();
	
	public List<Autos> listarxMarca(Autos a);

	// Metodos Personalizados
	public Autos buscarXNombre(Autos a);

	public List<Autos> buscarXAtributo(Autos a);

	public Autos elimiXNombre(Autos a);

}
