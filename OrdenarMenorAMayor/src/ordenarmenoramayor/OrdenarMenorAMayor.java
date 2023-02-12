package ordenarmenoramayor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenarMenorAMayor {
    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(15);
        numeros.add(50);
        numeros.add(1);
        numeros.add(20);
        numeros.add(75);

        // Ordenar la list de menor a mayor
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i) > numeros.get(j)) {
                    int aux = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, aux);
                }
            }
        }
        
        // Ordenar la lista de mayor a menor
       for(int i = 0; i < numeros.size(); i++) { 
            for(int j = i+1; j < numeros.size(); j++) { 
                if(numeros.get(i) < numeros.get(j)) { 
                    int aux = numeros.get(i); 
                    numeros.set(i, numeros.get(j)); 
                    numeros.set(j, aux); 
                } 
            } 
        } 
        
        System.out.println("Lista ordenada de menor a mayor: \n" + numeros);
        
        Collections.sort(numeros);
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(numeros, comparador);
        
        System.out.println("Números de mayor a menor: \n" + numeros);
    }
}
