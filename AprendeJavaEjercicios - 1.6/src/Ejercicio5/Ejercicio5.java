/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Mike
 * Ejercicio 5
    Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Horario  Clases");
         System.out.println("----------------");
         System.out.println("\033[31m 8:00\tEspañol");
         System.out.println("\033[32m 9:00\tMatematicas");
         System.out.println("\033[33m 10:00\tCiencias Naturales");
         System.out.println("\033[32m 10:30\tReceso");
         System.out.println("\033[35m 11:00\tHistoria");
         System.out.println("\033[36m 12:00\tGeografía");
    }
}
