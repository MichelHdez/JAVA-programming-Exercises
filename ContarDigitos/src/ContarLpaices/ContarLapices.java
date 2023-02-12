package ContarLpaices;

import java.util.HashMap;
import java.util.Set;

public class ContarLapices { 

    public static void main(String[] args) { 
        //Lista con los números que deseamos contar 
        int[] numeros = {1, 2, 4, 5, 2, 3, 3, 5, 1, 1 , 1, 8, 3}; 
  
        //Hashmap para almacenar los números y su cantidad 
        HashMap<Integer, Integer> numeroContador = new HashMap<>(); 
  
        // Recorremos la lista de números 
        for (int i = 0; i < numeros.length; i++) { 
            int num = numeros[i]; 
  
            if (numeroContador.containsKey(num)) { 
                int contar = numeroContador.get(num); 
                numeroContador.put(num, contar + 1); 
            } 
            else { 
                numeroContador.put(num, 1); 
            } 
        } 
  
        // Se imprime el resultado
        Set<Integer> nums = numeroContador.keySet(); 
        for (Integer n : nums) { 
            System.out.println("El número de lapices que hay del tipo " + n + " se repite " +  numeroContador.get(n) + " veces"); 
        } 
    } 
}