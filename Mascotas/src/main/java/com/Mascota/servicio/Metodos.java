package com.Mascota.servicio;

import java.util.List;

import com.Mascota.dominio.Mascota;

public interface Metodos {

	public void guardar(Mascota mas);

	public void editar(Mascota mas);

	public void eliminar(Mascota mas);

	public Mascota buscar(Mascota mas);

	public List<Mascota> listar();

	public List<Mascota> buscarNombre(Mascota mas);
}
