package areacircunferenciacírculo;

import java.util.Scanner;

/*
Construye un programa que al recibir como dato el radio de un circulo, calcule e imprima tanto su área como la longitud de la circunferencia
**El área del circulo la calculamos como:
Área = pi * radio^2

La cincunferencia la calculamos:
Longitud = 2*pi* radio
*/
public class AreaCircunferenciaCírculo {

    Scanner lector = new Scanner(System.in);

    public AreaCircunferenciaCírculo() {
        double rad, area, longitud;
        
        System.out.println("Ingrese el radio del circulo: ");
        rad =  lector.nextDouble();
        
        area = Math.PI * Math.pow(rad, 2);
        longitud = 2 * Math.PI * rad;
        
        System.out.println("El área del circulo es de: " + area);
        System.out.println("La longitud del circulo es de: " + longitud);
    }

    public static void main(String[] args) {
        AreaCircunferenciaCírculo solucion = new AreaCircunferenciaCírculo();
    }

}
