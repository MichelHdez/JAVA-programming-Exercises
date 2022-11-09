/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainvehiculo;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class MainVehiculo {
    public static int vehiculoMasBarato(Vehiculo autos[]){
        float precio;
        int indice = 0;

        precio = autos[0].getPrecio();
        for(int i=1; i < autos.length; i++) {
        if (autos[i].getPrecio() < precio) {
        precio = autos[i].getPrecio();
        indice = i;
        }
    }
        return indice;
    }

	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String marca, modelo;
            float precio;
            int numeroDeVehiculos,indiceBarato;

            // Se crean los objetos para los vehiculos
            System.out.println("Ingrese la cantidad de vehiculos a comparar");
            numeroDeVehiculos = entrada.nextInt();

            Vehiculo autos[] = new Vehiculo[numeroDeVehiculos];
            for (int i=0;i < autos.length; i++) {
            entrada.nextLine();
            System.out.println("Introduzca la marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca la modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            precio = entrada.nextFloat();

            // Se ingresan los autos almacenados que ingrese el usuario
            autos[i] = new Vehiculo(marca, modelo, precio);
            }

            indiceBarato = vehiculoMasBarato(autos);
            System.out.println("El vehiculo más barato es: \n");
            System.out.println(autos[indiceBarato].propiedadesVehiculo());
	}
}
