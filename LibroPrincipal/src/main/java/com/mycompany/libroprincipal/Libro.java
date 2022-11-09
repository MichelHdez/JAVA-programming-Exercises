/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroprincipal;

public class Libro {
    String nombre;
    String editorial;
    double precio;
    int hojas;
    
    public Libro(){
        
    }

    public Libro(String nombre, String editorial, double precio, int hojas) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.precio = precio;
        this.hojas = hojas;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", editorial=" + editorial + ", precio=" + precio + ", hojas=" + hojas + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }
    
    
    
}
