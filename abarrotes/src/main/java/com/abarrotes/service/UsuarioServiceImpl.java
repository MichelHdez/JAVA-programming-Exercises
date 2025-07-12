package com.abarrotes.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.abarrotes.dao.UsuarioDao;
import com.abarrotes.entity.Usuario;

@Repository
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao dao;

	public UsuarioServiceImpl(UsuarioDao dao) {
		this.dao = dao;
	}

	@Override
	public void guardar(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return dao.findAll();
	}

}
