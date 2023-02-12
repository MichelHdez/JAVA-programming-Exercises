/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arraylistseriecrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class ArrayListSerieCRUD {

    public static void main(String[] args) {
        String nombre, genero;
        int capitulos, temporada;

        Serie serie = null;
        Scanner lec = null;
        int menu, indice;

        //ArrayList
        List<Serie> lista = new ArrayList<>();
        do {
            System.out.println("Bienvenido al catálogo de Series");
            System.out.println("**Menú**");
            System.out.println("1)Alta");
            System.out.println("2)Editar");
            System.out.println("3)Eliminar");
            System.out.println("4)Buscar");
            System.out.println("5)Mostrar");
            System.out.println("6)Salir");

            lec = new Scanner(System.in);
            menu = lec.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Alta de Series");
                    System.out.println("Ingresa el nombre de la serie");
                    lec = new Scanner(System.in);
                    nombre = lec.nextLine();

                    System.out.println("Ingresa el género de la serie");
                    lec = new Scanner(System.in);
                    genero = lec.nextLine();

                    System.out.println("Ingresa los capitulos de la serie");
                    lec = new Scanner(System.in);
                    capitulos = lec.nextInt();

                    System.out.println("Ingresa el número de temporadas");
                    lec = new Scanner(System.in);
                    temporada = lec.nextInt();

                    serie = new Serie(nombre, genero, capitulos, temporada);
                    lista.add(serie);
                    System.out.println("Se guardó la serie " + serie.getNombre());
                    break;

                case 2:
                    //antes de editar hay que buscar el elemento
                    System.out.println("Escriba el indice a editar: ");
                    lec = new Scanner(System.in);
                    indice = lec.nextInt();
                    serie = lista.get(indice);

                    System.out.println("Escribe el nuevo género a modificar");
                    lec = new Scanner(System.in);
                    genero = lec.nextLine();
                    serie.setGenero(genero);
                    lista.set(indice, serie);
                    System.out.println("Se editó el contenido de la serie: " + serie);
                    break;
                case 3:
                    System.out.println("Escribe el indice a eliminar");
                    lec = new Scanner(System.in);
                    indice = lec.nextInt();
                    serie = lista.get(indice);
                    lista.remove(indice);
                    System.out.println("Se eliminó");
                    break;
                    
                case 4:
                    System.out.println("Escriba el indice a editar: ");
                    lec = new Scanner(System.in);
                    indice = lec.nextInt();
                    serie = lista.get(indice);
                    System.out.println("La serie encontrada es: " +serie);
                    break;
                case 5:
                    System.out.println(lista);
                    break;
                    
                case 6:
                    System.out.println("Vuelva pronto!!! Bye");
                    break;
            }

        } while (menu < 6);
    }//main
}//principal
