package com.abarrotes.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "abarrotes")
@AllArgsConstructor
@Data
public class Abarrote {

	/*
	 * CREATE TABLE ABARROTES(
	 * ID NUMBER PRIMARY KEY,
	 * NOMBRE_PRODUCTO NVARCHAR2(50),
	 * MARCA NVARCHAR2(50),
	 * STOCK NUMBER,
	 * CANTIDAD_VENDIDA NUMBER,
	 * PRECIO_VENTA NUMBER,
	 * FECHA_VENTA DATE,
	 * GANACIAS NUMBER
	 * );
	 * 
	 * 
	 * 
	 */

	@Id
	@Column()
	int id;
	@Column(name = "nombreProducto")
	String nombreProducto;
	@Column()
	String marca;
	@Column()
	int stock;
	@Column(name = "cantidadVendida")
	int cantidadVendida;
	@Column(name = "precioVenta")
	Double precioVenta;
	@JsonFormat(pattern = "dd/MM/YYYY", timezone = "America/Mexico_City")
	@Column(name = "fechaVenta")
	Date fechaVenta;
	@Column(name = "ganancias")
	Double ganancias;

	public Abarrote() {
		//
	}

}
