
package calcularvelocidadolimpiadas;

import java.util.Scanner;


public class CalcularVelocidadOlimpiadas {
    
    Scanner lector = new Scanner(System.in);
    
public CalcularVelocidadOlimpiadas() {
    double dis, min, seg, cen;
    System.out.println("Ingrese la distancia recorrida (en metros)");
    dis = lector.nextDouble();
    System.out.println("Ingrese la cantidada en minutos");
    min = lector.nextDouble();
    System.out.println("Ingrese la cantidad en segundo");
    seg = lector.nextDouble();
    System.out.println("Ingrese la cantidad en centesimas");
    cen = lector.nextDouble();
}

   
    public static void main(String[] args) {
        CalcularVelocidadOlimpiadas solucion = new CalcularVelocidadOlimpiadas();
    }
    
}
