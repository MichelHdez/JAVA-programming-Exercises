/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libroprincipal;

/**
 *
 * @author Mike
 */
public class LibroPrincipal {

    public static void main(String[] args) {
        String nombre;
        String editorial;
        double precio;
        int hojas;
        
        //constructor vacio
        Libro l = new Libro();
        l.setNombre("Las mil y una noches");
        l.setEditorial("Porrua");
        l.setPrecio(400);
        l.setHojas(1600);
        System.out.println("Libro 1");
        System.out.println("Nombre-->" +l.getNombre());
        System.out.println("Editorial-->" +l.getEditorial());
        System.out.println("Precio-->" +l.getPrecio());
        System.out.println("Hojas-->" +l.getHojas());
        
        Libro l2 = new Libro("Iliada y Odisea", "Íconos", 180, 650);
        System.out.println(l2);
    }//main
}//clase principal
