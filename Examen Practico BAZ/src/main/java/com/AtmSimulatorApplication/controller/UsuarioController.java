package com.AtmSimulatorApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AtmSimulatorApplication.model.Usuario;
import com.AtmSimulatorApplication.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll() {
         return usuarioService.buscarTodosLosUsuarios();
    }

    @PostMapping("/crearUsuario")
    public Usuario creacionUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }
    

}
