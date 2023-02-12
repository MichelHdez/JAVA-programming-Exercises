package ventas;

import java.util.Scanner;

/*
Construye un programa que, al recibir como datos el costo de un articulo vendido y la cantidad de dinero a pagar
y calcular:
1)El cambio que se debe entregar al cliente, si el pago efectuado es mayor que el precio del producto
2)¿Qué pasa si el cliente paga exactamente lo que vale el producto?
3)La cantidad de dinero que falta por pagar, si el pago efectuado es menor que el precio del producto
 */
public class Ventas {

    Scanner lector = new Scanner(System.in);

    public Ventas() {
        float costoArticulo, pagoCliente, cambio, faltante;
        
        System.out.println("Ingrese el precio del artículo");
        costoArticulo = lector.nextFloat();
        System.out.println("¿Cuánto ha pagado el cliente?");
        pagoCliente = lector.nextFloat();

        cambio = pagoCliente - costoArticulo;
        faltante = costoArticulo - pagoCliente;
        
        if (cambio < 0) {
            System.out.println("Falta dinero en el pago. El dinero faltante es de: " + faltante + " pesos");
        } else if (cambio==0) {
            System.out.println("Pago exacto. No es necesario dar cambio");
        } else if (cambio>0) {
            System.out.println("El cambio a dar es de: " + Math.round(cambio) + " pesos");
        }
    }

    public static void main(String[] args) {
        Ventas solucion = new Ventas();
    }

}
