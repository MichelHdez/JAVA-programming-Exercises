/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.celularprincipal;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class CelularPrincipal {

    public static void main(String[] args) {
    String modelo;
    String marca;
    double precio;
    int ram;
    Celular celu = null;
    int menu;
    Scanner lec = null;
    do{
        System.out.println("Bienvenido a Distribuidor de Celulares");
        System.out.println("Menu de Opciones");
        System.out.println("1)Alta");
        System.out.println("2)Editar");
        System.out.println("3)Mostrar");
        System.out.println("4)Salir");
        
        lec = new Scanner(System.in);
        menu = lec.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Alta Celular");
                System.out.println("Escribe el modelo");
                lec = new Scanner(System.in);
                modelo = lec.nextLine();
                System.out.println("Escribe la marca");
                lec = new Scanner(System.in);
                marca = lec.nextLine();
                System.out.println("Escribe el precio");
                lec = new Scanner(System.in);
                precio = lec.nextDouble();
                System.out.println("Escribe la ram");
                lec = new Scanner(System.in);
                ram = lec.nextInt();
                
                celu = new Celular(modelo,marca,precio,ram);
                System.out.println("Se dio de alta el celular" + celu.getModelo());
                break;
                
            case 2:
                System.out.println("Escriba el nuevo precio");
                lec = new Scanner(System.in);
                precio = lec.nextDouble();
                celu.setPrecio(precio);
                System.out.println("Se actualiza el precio");
                System.out.println(celu);
                break;
        
            case 3:
            System.out.println(celu);
                break;
          
            case 4:
            System.out.println("Bye");
            break;
        }
        
        }while(menu<4);
    }
}
