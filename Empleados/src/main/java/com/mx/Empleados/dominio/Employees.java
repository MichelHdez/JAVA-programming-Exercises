package com.mx.Empleados.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employees {

	/*
	 * CREATE TABLE GENDERS( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(255) );
	 * 
	 * CREATE TABLE JOBS( ID NUMBER PRIMARY KEY, NAME NVARCHAR2(255), SALARY NUMBER
	 * );
	 * 
	 * CREATE TABLE EMPLOYEES( ID NUMBER PRIMARY KEY, GENDER_ID NUMBER, JOB_ID
	 * NUMBER, NAME NVARCHAR2(255), LAS_NAME NVARCHAR2(255), CUMPLEANOS DATE,
	 * FOREIGN KEY(GENDER_ID) REFERENCES GENDERS, FOREIGN KEY(JOB_ID) REFERENCES
	 * JOBS );
	 * 
	 * CREATE TABLE EMPLOYEE_WORKED_HOURS( ID NUMBER PRIMARY KEY, EMPLOYEE_ID
	 * NUMBER, WORKED_HOURS NUMBER, WORKED_DATE DATE, FOREIGN KEY (EMPLOYEE_ID)
	 * REFERENCES EMPLOYEES );
	 * 
	 */

	@Id
	@Column
	int id;
	@Column
	String name;
	@Column
	String las_name;
	@Column
	Date cumpleanos;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GENDER_ID")
	Genders genders;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "JOB_ID")
	Jobs jobs;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Employee_worked_hours> HorasEmpleadas = new ArrayList<Employee_worked_hours>();

	public int compareTo(Employees e) {
		return this.las_name.compareTo(e.las_name);
	}

}
