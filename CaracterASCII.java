/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caracterascii;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class CaracterASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        char caracter = (char)num;
        System.out.println("El número " + num + " corresponde al caracter '"+caracter+"'");
    }
}
