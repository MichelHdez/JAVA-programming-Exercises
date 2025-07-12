package com.abarrotes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abarrotes.entity.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

	Usuario findByUsuario(String usuario);

}
