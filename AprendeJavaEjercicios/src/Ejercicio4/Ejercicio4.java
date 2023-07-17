/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Mike
 * Ejercicio 4
Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double euros = 21;
        int pesetas = (int)(euros * 100);
        System.out.println("Euros convertidos a pesetas son: " + pesetas);
    }
}
