package com.mx.CrudTienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mx.CrudTienda.UserDetailsService.detalleUsuarios;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	detalleUsuarios detalleServicioUsuario;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//	Una forma de hacerlo
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		{
			auth.userDetailsService(detalleServicioUsuario).passwordEncoder(passwordEncoder());
		}
	}
	
}
