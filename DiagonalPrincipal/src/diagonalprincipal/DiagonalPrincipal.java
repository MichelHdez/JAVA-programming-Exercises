package diagonalprincipal;

import java.util.Random;
import java.util.Scanner;

public class DiagonalPrincipal {

    public static void main(String[] args) {
        /*int rows, columns;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Por favor ingrese el número de filas de la matriz: ");
      rows = input.nextInt();
      
      System.out.println("Por favor ingrese el número de columnas de la matriz: ");
      columns = input.nextInt();
      
      int[][] array = new int[rows][columns];
      
      System.out.println("Por favor ingrese los elementos de la matriz: ");
      //Recorriendo el array de entrada
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            array[i][j] = input.nextInt();
         }
      }
      
      //Asegurando que la diagonal principal sea el mismo número
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (i == j) {
               array[i][j] = array[0][0]; //El mismo número
            }
         }
      }
      
      System.out.println("La matriz con la diagonal principal igual es:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print(array[i][j] + " ");
         }
         System.out.println();
      }*/

        int filas, columnas;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de filas de la matriz: ");
        filas = input.nextInt();

        System.out.println("Por favor ingrese el número de columnas de la matriz: ");
        columnas = input.nextInt();

        int[][] array = new int[filas][columnas];

        System.out.println("Por favor ingrese los elementos de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = input.nextInt();
            }
        }

        boolean valor = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j && array[i][j] != array[0][0]) {
                    valor = false;
                    break;
                }
            }
        }
        
        if (valor) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }    
    }
}
