package com.mx.CrudCarros.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ROLES_USUARIOS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuarios {

//	CREATE TABLE ROLES_USUARIOS(
//			ID NUMBER PRIMARY KEY,
//			NOMBRE NVARCHAR2(50),
//			PASSWORD NVARCHAR2(100)
//			);

	@Id
	@Column()
	int id;
	@Column()
	String nombre;
	@Column()
	String password;

	public Usuarios() {
	}

	public Usuarios(int id, String nombre, String password) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", password=" + password + "]";
	}

}
