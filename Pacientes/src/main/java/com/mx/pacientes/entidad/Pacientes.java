package com.mx.pacientes.entidad;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "PACIENTES")

public class Pacientes {
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String app;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column
	LocalDate fecha_nacimiento;
	@Column
	int edad;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm", timezone = "America/Mexico_City")
	@Column
	Date fecha_hora_registro;
	@Column
	String tipo_sangre;
	@Column
	String enfermedad;
	@Column
	int costo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "DOCTOR_ID")
	Doctor doctorId;

	public Pacientes() {
	}

	public Pacientes(int id, String nombre, String app, LocalDate fecha_nacimiento, int edad, Date fecha_hora_registro,
			String tipo_sangre, String enfermedad, int costo, Doctor doctorId) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.fecha_hora_registro = fecha_hora_registro;
		this.tipo_sangre = tipo_sangre;
		this.enfermedad = enfermedad;
		this.costo = costo;
		this.doctorId = doctorId;
	}

	@Override
	public String toString() {
		return "Pacientes [id=" + id + ", nombre=" + nombre + ", app=" + app + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", edad=" + edad + ", fecha_hora_registro=" + fecha_hora_registro + ", tipo_sangre=" + tipo_sangre
				+ ", enfermedad=" + enfermedad + ", costo=" + costo + ", doctorId=" + doctorId + "]\n";
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

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
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

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}
	
	
}
