/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainvehiculo;

/**
 *
 * @author Mike
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    // constructor
	public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
         this.precio = precio;
        this.modelo = modelo;
	}

	public float getPrecio(){
		return precio;
	}

    //método para mostrar los atributos del objeto creado
    public String propiedadesVehiculo() {
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n";

    }
}
