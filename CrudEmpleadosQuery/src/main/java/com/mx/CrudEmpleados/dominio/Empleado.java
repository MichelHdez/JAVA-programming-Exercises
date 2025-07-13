package com.mx.CrudEmpleados.dominio;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // de lombok
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // copnstructor con parametros
@Entity // nuestra entuidad del proyecto
@Table(name = "EMPLEADOS_ENCOM") // nombre de la tabla que va a represebtar la entidad
public class Empleado {
	/*
	 * CREATE TABLE EMPLEADOS_ENCOM( 
	 * ID NUMBER PRIMARY KEY, 
	 * NOMBRE NVARCHAR2(50),
	 * APP NVARCHAR2(50), 
	 * FECHA_NACIMIENTO DATE, 
	 * EDAD NUMBER, 
	 * FECHA_INGRESE DATE,
	 * DEPARTAMENTO NVARCHAR2(50), 
	 * SUELDO NUMBER, 
	 * CHECK (EDAD >= 30 AND EDAD <= 40),
	 * CHECK (DEPARTAMENTO IN ('PROGRAMACION','SOPORTE','RH','VENTAS')) );
	 */

	// el mapeo de la base de datos relacional
	// para tener mejor control de todos los objetos que se inicializan

	@Id
	int id;
	@Column()
	String nombre;
	@Column()
	String app;
	@Column()
	Date fecha_nacimiento;
	@Column()
	int edad;
	@Column()
	Date fecha_ingrese;
	@Column()
	String departamento;
	@Column()
	double sueldo;

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

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha_ingrese() {
		return fecha_ingrese;
	}

	public void setFecha_ingrese(Date fecha_ingrese) {
		this.fecha_ingrese = fecha_ingrese;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
