package com.mx.CrudCarros.UserDetailService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mx.CrudCarros.dao.UsuariosDao;
import com.mx.CrudCarros.dominio.Usuarios;

@Service
public class detalleUsuarios implements UserDetailsService{

	@Autowired
	UsuariosDao usuariosDao;
	
	Usuarios usuario = null;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios usuario = usuariosDao.findByNombre(username);
		System.out.println("Recibiendo al usuario-->"+usuario);
		
//		lista usuario de roles
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
//		autorizacion
		UserDetails userDetails = new User(usuario.getNombre(), usuario.getPassword(), roles);
		return userDetails;
	}

}
