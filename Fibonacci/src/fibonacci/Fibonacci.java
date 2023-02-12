
package fibonacci;

import java.util.Scanner;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
       
        int a = 0, b = 1, c, n;
       
        System.out.print("Por favor ingrese cantidad de elementos para la serie: ");
        n = teclado.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
