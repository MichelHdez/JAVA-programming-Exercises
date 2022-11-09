/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peliculaprincipal;

import java.util.Scanner;

public class PeliculaPrincipal {
    public static void main(String[] args) {
        String nombre;
        String director;
        double duracion;
        String genero;
        Pelicula peli = null;
        int menu;
        Scanner lec = null;
        
        do{    
        System.out.println("Bienvenido al catálogo de Peliculas");
        System.out.println("Menu de Opciones");
        System.out.println("1)Alta");
        System.out.println("2)Editar Género");
        System.out.println("3)Mostrar");
        System.out.println("4)Salir");
        lec = new Scanner(System.in);
        menu = lec.nextInt();
        switch(menu){
            case 1:
                System.out.println("Alta de Pelicula");
                System.out.println("Escribe la película");
                lec = new Scanner(System.in);
                nombre = lec.nextLine();
                System.out.println("Escribe el director");
                lec = new Scanner(System.in);
                director = lec.nextLine();   
                System.out.println("Escribe la duración");
                lec = new Scanner(System.in);
                duracion = lec.nextDouble(); 
                System.out.println("Escribe el genero");
                lec = new Scanner(System.in);
                genero = lec.nextLine();
                peli = new Pelicula(nombre, director, duracion, genero);
                System.out.println("Se dio de alta la película" + peli.getNombre());
                break;  
            case 2:
                System.out.println("Edite la nueva duración");
                lec = new Scanner(System.in);
                duracion = lec.nextDouble();
                peli.setDuracion(duracion);
                System.out.println("Se actualiza la duración");
                System.out.println(peli);
                break;
            case 3:
            System.out.println(peli);
                break;
            case 4:
            System.out.println("Bye");
            break;
        }
        }while(menu<4);
    }
}
