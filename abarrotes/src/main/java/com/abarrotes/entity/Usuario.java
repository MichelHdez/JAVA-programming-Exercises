package com.abarrotes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@Data
public class Usuario {

	/*
	 * CREATE TABLE USUARIO_A(
	 * ID NUMBER PRIMARY KEY,
	 * USUARIO NVARCHAR2(100),
	 * PASSWORD NVARCHAR2(100)
	 * );
	 * 
	 */
	@Id
	@Column()
	int id;
	@Column()
	String username;
	@Column()
	String password;

	public Usuario() {
		//
	}

}
