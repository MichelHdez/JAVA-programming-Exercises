package dolarapeso;

import java.util.Scanner;

public class DolarAPeso {
    Scanner lector = new Scanner(System.in);
    public DolarAPeso() {
        float pDolar, dolares , peso;
        
        System.out.println("Ingrese el precio actual del dolar: ");
        pDolar = lector.nextFloat();
        
        System.out.println("Ingrese la cantidad de dolares a convertir : ");
        dolares = lector.nextFloat();
        
        peso =dolares * pDolar;
        
        System.out.println(dolares + "dólares equivalen a: " + peso + "pesos");
    }

    public static void main(String[] args) {
        DolarAPeso solucion = new DolarAPeso();
    }

}
