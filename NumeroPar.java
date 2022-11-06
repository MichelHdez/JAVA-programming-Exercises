/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeropar;

import java.util.Scanner;

/**
 *
 * @author Mike
 * 
 * Indicar si un numero pasado por consola es par o no.
 */
public class NumeroPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número");
        int num;
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
