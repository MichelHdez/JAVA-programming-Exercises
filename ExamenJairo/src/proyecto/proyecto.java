package proyecto;

import java.util.Scanner;

public class proyecto {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	        
		Scanner scanner = new Scanner(System.in);
	      double lado1;
		  double lado2;
		  int n = scanner.nextInt();	        
	   //   int[] arreglo = new int[n];
		  double res1;
		  int op2 = 0;
		  int f;
	      int opcion;
	        
	       
	        do {
	            System.out.println("Opciones:");
	            System.out.println("1. Área de un rectángulo");
	            System.out.println("2. Crear un arreglo unidimensional");
	            System.out.println("3. Salir");
	            System.out.print("Ingrese una opción: ");
	            opcion = scanner.nextInt();
	            
	            switch (opcion) {
	                case 1:
	                    System.out.println("Ingresa base");
	                    lado1 = scanner.nextDouble();
	                    System.out.println("Ingresa altura");
	                    lado2 = scanner.nextDouble();
	                    res1 = lado1 * lado2;
	                    System.out.println("El area del restangulo es: " + res1);
	                    break;
	                case 2:
	                	do{
	                	System.out.println("¿Que desea hacer?");
	                	System.out.println("1.- Crear Arreglo");
	                	System.out.println("2.- Mostrar Elemtos de N a ultimo Elemento Guardado");
	                	System.out.println("3.- Regresar al menu principal");
	                	op2 = scanner.nextInt();
	                	switch (op2) {
	                	     case 1:
	                	    	 do {
	                	             System.out.print("Introduce el tamaño para dimensionar el arreglo: ");
	                	             n = scanner.nextInt();
	                	             
	                	             if (n <= 0) {
	                	                 System.out.println("Tamaño para dimensionar arreglo inválido");
	                	             }
	                	         } while (n <= 0);
	                	    	int[] NewArreglo = new int[n];
	                            System.out.println("Ingresa valores del 1 a n para llenar tu arreglo unidimencional");
	                            for (int i = 0; i < n; i++) {
	                                NewArreglo[i] = scanner.nextInt();
	                            }
	                            
	                            System.out.println("El nuevo arreglo es : ");
	                            for (int num : NewArreglo) {
	                                System.out.print(num + " ");}
	                            
	                            /* for (int i=0; i<n; i++){
	                            	   System.out.print("Elemento " + (i + 1) + ": ");
	                            	   NewArreglo[i] = scanner.nextInt();	  
	                    	       if ( NewArreglo[i] <= 0) {
	                    		      System.out.println("Valor invalido");
	                    	       }else {
	                    		      System.out.println("Elemento" + arreglo[i] + "Guardado");
	                    	        }
	                               }*/
	                        break;
	                        case 2:
	                        	int[] NewArreglo2 = new int[n];
	                    	    System.out.println("Ingrese el numero apartir del cual quiere ver los Elementos del arreglo");
	                    	    n = scanner.nextInt();
	                    	    for (int i = n; i < NewArreglo2.length; i++) {
	                               System.out.println("Elemento " + (i) + "," + NewArreglo2.length);
	                            }
	                    	break;	 
	                      }
	                    }while(op2 != 3);
	                    
	                    break;
	                case 3:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
	                   
	               }
	         } while (opcion != 3);
	}
}