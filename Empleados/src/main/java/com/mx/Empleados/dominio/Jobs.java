package com.mx.Empleados.dominio;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JOBS")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Jobs {
	@Id
	@Column
	int id;
	@Column
	String name;
	@Column
	int salary;
	
	@OneToMany(mappedBy = "jobs", cascade =  CascadeType.ALL)
	@JsonIgnore
	List<Employees> EmpleadoJobs = new ArrayList<Employees>();
	
	
	
}
