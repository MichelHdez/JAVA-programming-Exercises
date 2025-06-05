package com.mx.CrudPaciente.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table( name = "PACIENTES_JULIO")
public class Paciente {

	/*
	 * CREATE TABLE PACIENTES_JULIO( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(50),
	 * APP NVARCHAR2(50), FECHA_NACIMIENTO DATE, EDAD NUMBER, FECHA_HORA_REGISTRO
	 * DATE, TIPO_SANGRE NVARCHAR2(50), TIPO_ENVERMEDAD NVARCHAR2(50), COSTO NUMBER,
	 * CHECK (TIPO_SANGRE IN('O-POSITIVO','O-NEGATIVO')), CHECK (TIPO_ENVERMEDAD
	 * IN('FIEBRE','COVID')), CHECK (EDAD > 10 AND EDAD <= 30) );
	 */
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String app;
	@Column()
	@JsonFormat (pattern = "dd/mm/yyy")
	Date fecha_nacimiento;
	@Column
	int edad;
	@Column
	Date fecha_hora_registro;
	@Column
	String tipo_sangre;
	@Column
	String tipo_enfermedad;
	@Column
	int costo;
	
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", app=" + app + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", edad=" + edad + ", fecha_hora_registro=" + fecha_hora_registro + ", tipo_sangre=" + tipo_sangre
				+ ", tipo_enfermedad=" + tipo_enfermedad + ", costo=" + costo + "]";
	}
	
	
	public Paciente () {
		
	}

	public Paciente(int id, String nombre, String app, Date fecha_nacimiento, int edad, Date fecha_hora_registro,
			String tipo_sangre, String tipo_enfermedad, int costo) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.fecha_hora_registro = fecha_hora_registro;
		this.tipo_sangre = tipo_sangre;
		this.tipo_enfermedad = tipo_enfermedad;
		this.costo = costo;
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


	public Date getFecha_hora_registro() {
		return fecha_hora_registro;
	}


	public void setFecha_hora_registro(Date fecha_hora_registro) {
		this.fecha_hora_registro = fecha_hora_registro;
	}


	public String getTipo_sangre() {
		return tipo_sangre;
	}


	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}


	public String getTipo_enfermedad() {
		return tipo_enfermedad;
	}


	public void setTipo_enfermedad(String tipo_enfermedad) {
		this.tipo_enfermedad = tipo_enfermedad;
	}


	public int getCosto() {
		return costo;
	}


	public void setCosto(int costo) {
		this.costo = costo;
	}
}
