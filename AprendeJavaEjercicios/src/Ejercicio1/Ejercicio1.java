/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Mike
 * Ejercicio 1
    Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
    los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
    el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        
        System.out.println(x);
        System.out.println(y);
        
        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = x / y;
        
        System.out.println("Resultado Suma : " + suma);
        System.out.println("Resultado Resta : " + resta);
        System.out.println("Resultado Multiplicación : " + multiplicacion);
        System.out.println("Resultado División : " + division);
    }
}
