package com.mx.Empleados.dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee_worked_hours {
	@Id
	@Column
	int id;
	@Column
	int worked_hours;
	@Column
	Date worked_date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPLOYEE_ID")
	Employees employee;
}
