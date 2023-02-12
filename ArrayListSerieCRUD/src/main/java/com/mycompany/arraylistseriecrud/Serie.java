/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistseriecrud;

/**
 *
 * @author Mike
 */
public class Serie {

    String nombre, genero;
    int capitulos, temporada;

    public Serie() {
    }

    public Serie(String nombre, String genero, int capitulos, int temporada) {
        this.nombre = nombre;
        this.genero = genero;
        this.capitulos = capitulos;
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", genero=" + genero + ", capitulos=" + capitulos + ", temporada=" + temporada + '}';
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

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

}
