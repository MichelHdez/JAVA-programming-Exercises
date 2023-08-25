package com.sbf.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Usuario {

	// Valida que el String sea distinto de null -- @NotEmpty aplica solamente con String	
// UNA FORMA DE PERSONALIZAR MENSAJES DE ERROR	@NotEmpty(message = "El usuario no puede estar vacío")
//	CON @PATTERN PODEMOS HACER USO DE EXPRESIONES REGULARES PARA VALIDAR
//	@Pattern(regexp = "[0-9]{2}[.,][\\d]{3}[.,][\\d]{3}[-][a-zA-Z]{1}")
	@Size(min = 3, max = 12)
	private String username;
	@NotEmpty
	private String password;
// UNA FORMA DE PERSONALIZAR MENSAJES DE ERROR	@NotEmpty(message = "Correo con formato incorrecto")
	@Email
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
