package com.mx.CrudTienda.servicios;

import java.util.List;
import com.mx.CrudTienda.dominio.Usuarios;

public interface MetodosUsuarios {

	public List<Usuarios> listar();
	
	public Usuarios guardar(Usuarios usuarios);
	
	public Usuarios guardarUsuario(Usuarios usuarios);
}
