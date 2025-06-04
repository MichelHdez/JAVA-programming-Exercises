package com.celulares.dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
public class Pedido {

	/*
	 * CREATE TABLE PEDIDOS(
	 * ID NUMBER PRIMARY KEY,
	 * NOMBRE NVARCHAR2(50),
	 * APP NVARCHAR2(50),
	 * FECHA_NACIMIENTO DATE,
	 * EDAD NUMBER,
	 * DOMICILIO NVARCHAR2(50),
	 * TELEFONO NVARCHAR2(50),
	 * DIRECCION NVARCHAR2(50),
	 * CHECK (EDAD >= 18 AND EDAD <= 99));
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String app;
	@Column
	Date fechadenacimiento;
	@Column
	int edad;
	@Column
	String domicilio;
	@Column
	String telefono;
	@Column
	String direccion;

	public Pedido() {
		//
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nombre=" + nombre + ", app=" + app + ", fechadenacimiento=" + fechadenacimiento
				+ ", edad=" + edad + ", domicilio=" + domicilio + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]";
	}

}
