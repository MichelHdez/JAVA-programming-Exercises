package com.mx.CrudPeliculasMax.dominio;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PELICULAS_MAX")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Getter
@Setter
public class Peliculas {
	
	/* Spring Data JPA --> EL mapeo de objeto relacion 
	 * CREATE  TABLE PELICULAS_MAX(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
GENERO NVARCHAR2(100),
CANTIDAD_DISPONIBLE NUMBER, 
CANTIDAD_VENDIDAS NUMBER, 
FECHA_HORA DATE,
IDIOMA NVARCHAR2(50),
PRECIO_VENTA NUMBER, 
GANANCIAS NUMBER, 
CHECK (GENERO IN('ACCION','ROMANTICAS','TERROR')), --> CONSTRAINT --> RESTRICCION 
CHECK (PRECIO_VENTA IN(300,400,500))
);
	 * 
	 * */
	
	@Id
	@Column()
	int id;
	@Column()
	String nombre;
	@Column()
	String genero;
	@Column()
	int cantidad_disponible;
	@Column()
	int cantidad_vendidas;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Guadalajara/Ciudad de México/Monterrey")	
	@Column()
	Date fecha_hora;
	@Column()
	String idioma;
	@Column()
	double precio_venta;
	@Column()
	double ganancias;
	
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCantidad_disponible() {
		return cantidad_disponible;
	}
	public void setCantidad_disponible(int cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}
	public int getCantidad_vendidas() {
		return cantidad_vendidas;
	}
	public void setCantidad_vendidas(int cantidad_vendidas) {
		this.cantidad_vendidas = cantidad_vendidas;
	}
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	

}
