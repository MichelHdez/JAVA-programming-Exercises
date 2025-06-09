package com.mx.CrudComputadoras.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // con esta anotacion le indico a spring que esta clase va a ser una entidad 
@Table(name="COMPUTADORAS_MAVEN")
public class Computadoras {
	
	/* version spring boot 2.7.2 hasta 2.7.10 javax 
	 *                     3.0.1 --> jakarta 
	 *                     
	 *                     CREATE TABLE COMPUTADORAS_MAVEN(
ID NUMBER PRIMARY KEY NOT NULL,
MARCA NVARCHAR2(50),
MODELO NVARCHAR2(50),
COLOR NVARCHAR2(50),
PESO NVARCHAR2(50),
PRECIO NUMBER,
SO NVARCHAR2(50)
);
	 * */
	
	// mapear la base de datos --> el mapeo de objeto relacional 
	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name="MARCA", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String marca;
	@Column(name="MODELO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String modelo;
	@Column(name="COLOR", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String color;
	@Column(name="PESO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String peso;
	@Column(name="PRECIO", columnDefinition = "NUMBER", nullable = false)
	double precio;
	@Column(name="SO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String so;
	
	public Computadoras() {
	
	}

	public Computadoras(int id) {
	
		this.id = id;
	}

	public Computadoras(int id, String marca, String modelo, String color, String peso, double precio, String so) {
		
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.peso = peso;
		this.precio = precio;
		this.so = so;
	}

	@Override
	public String toString() {
		return "Computadoras [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", peso="
				+ peso + ", precio=" + precio + ", so=" + so + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}
	
	

}
