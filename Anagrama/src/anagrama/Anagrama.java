package anagrama;

import java.util.Scanner;

public class Anagrama {

    /*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
     */
    public static void main(String[] args) {
        String p1;
        String p2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        p1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra");
        p2 = sc.nextLine();

        if (p1.length() == p2.length()) {
            for (int i = 0; i < p1.length(); i++) {
                if (!p2.contains(String.valueOf(p1.charAt(i)))) {
                    System.out.println("No es un anagrama");
                    return;
                } else if (p1.equals(p2)) {
                    System.out.println("Dos palabras exactamente iguales no son anagrama");
                    return;
                }
            }

            System.out.println("Si es un anagrama");
        } else {
            System.out.println("La cantidad de caracteres es diferente");
        }
    }
}
