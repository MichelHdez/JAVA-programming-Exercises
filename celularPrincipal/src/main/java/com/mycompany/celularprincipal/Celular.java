/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celularprincipal;

/**
 *
 * @author Mike
 */
public class Celular {
    String modelo;
    String marca;
    double precio;
    int ram;
    
    public Celular(){
        
    }

    public Celular(String modelo, String marca, double precio, int ram) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Celular{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", ram=" + ram + '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
}
