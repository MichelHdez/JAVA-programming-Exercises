/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionminutos;

import java.util.Scanner;

public class ConversionMinutos {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int minutos; 
        System.out.println("Ingresa el valor en minutos a convertir");
        minutos = lec.nextInt();
        
        if (minutos > 100 || minutos < 1) {
            System.out.println("El número de minutos ingresado no puede ser mayor de 100 ni menor de 1");
            return;
        }
        
        int segundos = minutos * 60;
        System.out.println(minutos + " minuto son: " + segundos + " segundos");
    }
    
}
