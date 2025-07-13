package com.mx.pacientes.dominio;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PACIENTES_JULIO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pacientes {

	@Id
	@Column(name = "ID")
	int id;
	@Column(name = "NOMBRE", unique = true)
	String nombre;
	@Column
	String app;
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	Date fechaNacimiento;
	@Column
	int edad;
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	Date fechaHoraRegistro;
	@Column
	String tipoSangre;
	@Column(name = "TIPO_ENVERMEDAD")
	String tipoEnfermedad;
	@Column
	double costo;
}
