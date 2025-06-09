package com.Lista.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOMBRES")
public class Nombres {

	@Id
	@Column()
	int id;
	@Column()
	String nombres;

	public Nombres() {
	}

	public Nombres(int id, String nombres) {
		this.id = id;
		this.nombres = nombres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "Nombres [id=" + id + ", nombres=" + nombres + "]";
	}

}
