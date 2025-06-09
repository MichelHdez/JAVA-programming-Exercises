package com.AtmSimulatorApplication.service;

import java.util.List;

import com.AtmSimulatorApplication.model.Usuario;

public interface UsuarioService {

    List<Usuario> buscarTodosLosUsuarios();

    Usuario crearUsuario(Usuario usuario);

}
