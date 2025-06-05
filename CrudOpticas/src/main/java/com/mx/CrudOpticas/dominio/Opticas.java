package com.mx.CrudOpticas.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OPTICA")
public class Opticas {

	/*
	 * CREATE TABLE OPTICA( ID NUMBER PRIMARY KEY NOT NULL, NOMBRE NVARCHAR2(50),
	 * MARCA NVARCHAR2(50), MODELO NVARCHAR2(50), ARMAZON NVARCHAR2(50), MICA
	 * NVARCHAR2(50), GRADUACION NUMBER, TIPO NVARCHAR2(50), PRECIO NUMBER );
	 */

	// Mapear la base de datos

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String nombre;
	@Column(name = "MARCA", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String marca;
	@Column(name = "MODELO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String modelo;
	@Column(name = "ARMAZON", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String armazon;
	@Column(name = "MICA", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String mica;
	@Column(name = "GRADUACION", columnDefinition = "NUMBER", nullable = false)
	double graduacion;
	@Column(name = "TIPO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String tipo;
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	double precio;

	public Opticas() {
	}

	public Opticas(int id) {
		this.id = id;
	}

	public Opticas(int id, String nombre, String marca, String modelo, String armazon, String mica, double graduacion,
			String tipo, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.armazon = armazon;
		this.mica = mica;
		this.graduacion = graduacion;
		this.tipo = tipo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Opticas [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", armazon="
				+ armazon + ", mica=" + mica + ", graduacion=" + graduacion + ", tipo=" + tipo + ", precio=" + precio
				+ "]/n";
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getArmazon() {
		return armazon;
	}

	public void setArmazon(String armazon) {
		this.armazon = armazon;
	}

	public String getMica() {
		return mica;
	}

	public void setMica(String mica) {
		this.mica = mica;
	}

	public double getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
