package com.Autos.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTOS")
public class Autos {

//	CREATE TABLE AUTOS(
//			ID NUMBER PRIMARY KEY,
//			MARCA NVARCHAR2(50),
//			MODELO NVARCHAR2(50),
//			COLOR NVARCHAR2(50),
//			TIPO NVARCHAR2(50),
//			NUM_PUERTAS NUMBER,
//			PRECIO NUMBER
//			);

	@Id
	@Column(name = "id")
	int id;
	@Column()
	String marca;
	@Column()
	String modelo;
	@Column()
	String color;
	@Column()
	String tipo;
	@Column()
	int num_puertas;
	@Column()
	double precio;

	public Autos() {
	}

	public Autos(int id, String marca, String modelo, String color, String tipo, int num_puertas, double precio) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.num_puertas = num_puertas;
		this.precio = precio;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", num_puertas=" + num_puertas + ", precio=" + precio + "]";
	}

}
