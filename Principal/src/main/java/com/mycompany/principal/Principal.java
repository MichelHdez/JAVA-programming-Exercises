/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author Mike
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
	String region;
	double precio;
        
        //constructor vacio
        Torta t = new Torta();
        t.setNombre("milanesa");
        t.setRegion("Sur");
        t.setPrecio(45);
        System.out.println("Torta 1");
        System.out.println("Nombre-->" + t.getNombre());
        System.out.println("Region-->" + t.getRegion());
        System.out.println("Precio-->" + t.getPrecio());
        
        //constructor con parametros
        Torta t2 = new Torta("Cubana","Centro",55);
        System.out.println(t2);
        
    }//main
}//fin clase principal
