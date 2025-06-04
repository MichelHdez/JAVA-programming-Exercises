package com.mx.CrudCarros.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARROS")
public class Carros {

	/*
	 * ID NUMBER PRIMARY KEY NOT NULL, NOMBRE VARCHAR2(50)NOT NULL, COLOR VARCHAR2
	 * (50)NOT NULL, NUM_ASIENTOS NUMBER NOT NULL, TIPO VARCHAR2 (50) NOT NULL
	 */
	@Id
	@Column()
	int id;

	@Column()
	String nombre;

	@Column()
	String color;

	@Column()
	int num_asientos;

	@Column()
	String tipo;

	public Carros() {

	}

	public Carros(int id) {

		this.id = id;
	}

	public Carros(int id, String nombre, String color, int num_asientos, String tipo) {

		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.num_asientos = num_asientos;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Carros [id=" + id + ", nombre=" + nombre + ", color=" + color + ", num_asientos=" + num_asientos
				+ ", tipo=" + tipo + "]\n";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum_asientos() {
		return num_asientos;
	}

	public void setNum_asientos(int num_asientos) {
		this.num_asientos = num_asientos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
