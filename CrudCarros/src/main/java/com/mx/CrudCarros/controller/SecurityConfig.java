package com.mx.CrudCarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mx.CrudCarros.UserDetailService.detalleUsuarios;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	detalleUsuarios detalleServicioUsuario;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		{
			auth.userDetailsService(detalleServicioUsuario).passwordEncoder(passwordEncoder());
		}
		
	}

}
