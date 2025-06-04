package com.celulares.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "celulares")
@Data
@AllArgsConstructor
public class Celulares {

	// CREATE TABLE CELULARES(
	// ID NUMBER PRIMARY KEY NOT NULL,
	// MARCA NVARCHAR2(50),
	// MODELO NVARCHAR2(50),
	// COLOR NVARCHAR2(50),
	// PRECIO NUMBER,
	// COMPANIA NVARCHAR2(50)
	// );

	@Id
	@Column(name = "id", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name = "marca", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String marca;
	@Column(name = "modelo", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String modelo;
	@Column(name = "color", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String color;
	@Column(name = "precio", columnDefinition = "NUMBER", nullable = false)
	double precio;
	@Column(name = "compañia", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String compania;

	public Celulares() {
		//
	}
	

	@Override
	public String toString() {
		return "Celulares [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio="
				+ precio + ", compania=" + compania + "]";
	}

}
