package com.Mascota.dominio;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "mascotas")
@Data
@AllArgsConstructor
public class Mascota {

	// CREATE TABLE MASCOTAS(
	// ID NUMBER PRIMARY KEY,
	// NOMBRE NVARCHAR2(50),
	// RAZA NVARCHAR2(50),
	// COLOR NVARCHAR2(50),
	// FECHA_NACIMIENTO DATE,
	// EDAD NUMBER,
	// CANTIDAD NUMBER,
	// CANTIDAD_VENTA NUMBER,
	// PRECIO_VENTA NUMBER,
	// FECHA_VENTA DATE,
	// GANANCIAS NUMBER
	// );

	@Id
	@Column()
	int id;
	@Column()
	String nombre;
	@Column()
	String raza;
	@Column()
	String color;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "America/Mexico_City")
	@Column()
	Date fechaNacimiento;
	@Column()
	int edad;
	@Column()
	double cantidad;
	@Column()
	double cantidadVenta;
	@Column()
	double precioVenta;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Mexico_City")
	@Column()
	Date fechaVenta;
	@Column()
	double ganancias;

	public Mascota() {
		//
	}

	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", cantidad=" + cantidad + ", cantidadVenta=" + cantidadVenta
				+ ", precioVenta=" + precioVenta + ", fechaVenta=" + fechaVenta + ", ganancias=" + ganancias + "]";
	}

}
