package com.mx.pacientes.entidad;


import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String app;
	@Column
	String especialidad;


	@OneToMany(mappedBy = "doctorId",cascade = CascadeType.ALL)
	List<Pacientes> lista = new ArrayList<Pacientes>();


	public Doctor(int id, String nombre, String app, String especialidad) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.especialidad = especialidad;
	}


	public Doctor() {
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nombre=" + nombre + ", app=" + app + ", especialidad=" + especialidad + "]\n";
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


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
}
