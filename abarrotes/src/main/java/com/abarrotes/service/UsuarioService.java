package com.abarrotes.service;

import java.util.List;

import com.abarrotes.entity.Usuario;

public interface UsuarioService {
	
	public void guardar(Usuario usuario);
	public List<Usuario> listarUsuarios();

}
