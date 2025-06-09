package com.AtmSimulatorApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AtmSimulatorApplication.model.Usuario;
import com.AtmSimulatorApplication.repository.UsuarioRepository;
import com.AtmSimulatorApplication.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> buscarTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

}
