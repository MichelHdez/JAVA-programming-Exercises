
package ordenarhashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class OrdenarHashMap {
    
    /**
     * 
     * Ordenar números de menor a mayor utilizando HashMap
     */ 
   
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("c", 3);
        numbers.put("b", 2);
        numbers.put("a", 1);
        numbers.put("e", 5);
        numbers.put("d", 4);
        numbers.put("f", 6);
        
        
        TreeMap<String, Integer> orderNumbers = new TreeMap<String, Integer>(numbers);
        
        System.out.println("Números ordenados " + orderNumbers);

        
    }
    
}
