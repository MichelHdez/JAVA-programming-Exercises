package com.abarrotes.roles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abarrotes.dao.UsuarioDao;
import com.abarrotes.entity.Usuario;

@Service
public class UserService implements UserDetailsService {

	private UsuarioDao dao;

	public UserService(UsuarioDao dao) {
		this.dao = dao;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario us = dao.findByUsuario(username);
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));

		return new User(us.getUsername(), us.getPassword(), roles);
	}

}
