package com.mx.CrudOpticas.servicio;

import java.util.List;

import com.mx.CrudOpticas.dominio.Opticas;

public interface Metodos {

	public void guardar(Opticas optic);

	public void editar(Opticas optic);

	public void eliminar(Opticas optic);

	public Opticas buscar(Opticas optic);

	public List<Opticas> listar();
}
