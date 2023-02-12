package app;

import static java.lang.reflect.Array.set;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {

    //Invertir una cadena
    /*public void InvertirString(String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            newText.append(array[i - 1]);
            System.out.println(newText);
        }*/
	
		//Otra forma de invertir cadena
		 /*String newText = new StringBuilder(text).reverse().toString();
		        System.out.println(newText);*/
    
		//Número Capicúa
    	/* public void esCapicua(int number) {
        String numberText = String.valueOf(number); //Convierte a una cadena String los tipos de datos pasados como parámetro
        String reverseNumber = new StringBuilder(numberText).reverse().toString(); // StringBuiilder Realiza la inversión de caracteres a la cadena de texto.
        if (numberText.equals(reverseNumber)) {
            System.out.println("Es Capicúa");
        } else {
            System.out.println("No es Capicúa");
        }
    }*/
    
    //Multiplo de...
    /*public void Multiplo(int number){
        if(number % 2 == 0){
            System.out.println("Es múltiplo");
        } else {
            System.out.println("No es múltiplo");
        }
    }*/
    //Anio Bisiesto
    /*public void anioBisiesto(int year) {
        boolean anioBisiesto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(anioBisiesto);
    }*/
    
    //NoDuplicados
    /*public void noDuplicados(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }*/
 
	//Factorial de un n�mero
	/*public void Factorial() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un n�mero");
		int n = leer.nextInt();
		int factorial = 1;
		for(int i = 1; i<=n; i++) {
		factorial*= i;
		}
		System.out.println("El factorial de " + n + "es :" +factorial);
	}*/
	
    //Serie Fibonacci
	/*public static void Finbonacci(){
		Scanner leer = new Scanner(System.in);
		int a = 0, b = 1, c, n;
		System.out.print("Ingresa la cantidad  de elementos para la serie");
		n = leer.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}*/
	
	/*public class Main {
    public static void main(String[] args) throws Exception {
        String cadena = "java desde mundo hola";
        String newCadena = "";
        for (int i = cadena.length()-1 ;i >=0; i--) {
            if (cadena.substring(i, i+1).equals(" ")){ //si es ecncuentra un espacio vacio
                for (int j = i+1 ; j < cadena.length();  j++) {
                    newCadena += cadena.charAt(j); //se concatena cada letra de la palabra luego del espacio
                }
                cadena = cadena.replace(cadena.substring(i,cadena.length()), "");
                newCadena += " ";
            } else if (i==0) {
                for (int j = 0; j < cadena.length(); j++){
                    newCadena += cadena.charAt(j);
                }
                 cadena = cadena.replace(cadena.substring(i,cadena.length()), "");
            }
        }
        System.out.print(newCadena);
    }
}
*/


    public static void main(String[] args) {
        App app = new App();
        //app.InvertirString("HolaMundo");
        //app.esCapicua(100121);
        //app.Multiplo(44);
        //app.anioBisiesto(2022);
        //app.noDuplicados(Arrays.asList(1,1,1,2,3,4,5,6,0,7,8,9,10,10,10));
    	}
	}