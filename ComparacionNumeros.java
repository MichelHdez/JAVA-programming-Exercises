/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparacionnumeros;

import java.util.Scanner;

/**
 *
 * @author Mike
 * 
 *  Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales.
 */
public class ComparacionNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Ingresa el primer número");
        a = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("El primer número es mayor que el segundo");
        } else  if ((a < b)) {
            System.out.println("El segundo número es mayor que el primero");
        } else{
            System.out.println("Ambos números son iguales");
        }
            
    }
}
