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
@Table(name = "GENDERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Genders {
	@Id
	@Column
	int id;
	@Column
	String nombre;
	
	@OneToMany(mappedBy = "genders", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Employees> lista = new ArrayList<Employees>();
	
}
