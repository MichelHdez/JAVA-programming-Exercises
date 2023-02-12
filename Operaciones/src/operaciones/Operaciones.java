//Crear un programa que, al recibir como datos dos números enteros, calcule la suma, resta y multiplicación de dichos números
package operaciones;

import java.util.Scanner;

public class Operaciones {

    Scanner lector = new Scanner(System.in);

    public Operaciones() {
        float n1, n2, suma, resta, multiplicacion;
        System.out.println("Ingresa el primer número");
        n1 = lector.nextFloat();
        System.out.println("Ingresa el segundo número");
        n2 = lector.nextFloat();
        
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
    }

    public static void main(String[] args) {
        Operaciones solucion = new Operaciones();
    }

}
