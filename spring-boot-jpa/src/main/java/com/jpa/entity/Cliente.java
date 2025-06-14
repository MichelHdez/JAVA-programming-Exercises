package com.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;

//@Entity: This annotation indicates that this class is a JPA entity and will be mapped to a database table.
@Entity
// @Table(name = "clientes"): This annotation specifies the name of the database
// table that this entity will be mapped to.
@Table(name = "clientes")
// public class Cliente implements Serializable {... }: This is the class
// definition for the Cliente entity. It implements the Serializable interface,
// which is a requirement for JPA entities.
public class Cliente implements Serializable {

	// @Id: This annotation indicates that the following field is the primary key of
	// the entity.
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY): This annotation
	// specifies that the primary key value will be generated by the database using
	// an identity column.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// private Long id;: This is the primary key field for the entity.
	private Long id;
	// @Column(): This annotation indicates that the following field will be mapped
	// to a column in the database table.
	@Column()
	private String nombre;
	@Column()
	private String apellido;
	@Email
	private String email;
	// @Column(name = "create_at"): This annotation specifies the name of the column
	// in the database table that the following field will be mapped to.
	@Column(name = "create_at")
	// @Temporal(TemporalType.DATE): This annotation specifies that the following
	// field should be treated as a date.
	@Temporal(TemporalType.DATE)
	// @DateTimeFormat(pattern = "yyyy-MM-dd"): This annotation specifies the format
	// of the date string.
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	// private Date createAt;: This is a field that will be mapped to a column in
	// the database table and should contain a date value.
	private Date createAt;

	public Cliente() {
	}

	public Cliente(Long id, String nombre, String apellido, @Email String email, Date createAt) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.createAt = createAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", createAt=" + createAt + "]";
	}

}
