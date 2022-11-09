/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriecrud;

/**
 *
 * @author Mike
 */
public class Serie {
    String nombre;
    int capitulos;
    int temporada;
    String genero;

    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
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

    public String getGenero() {
            return genero;
    }

    public void setGenero(String genero) {
            this.genero = genero;
    }
}
