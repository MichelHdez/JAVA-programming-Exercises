package entrega.ejercicios.tema.pkg4;

/*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/
public class EntregaEjerciciosTema4 {

    public static void main(String[] args) {
        
        SmartWatch sw = new SmartWatch("negro", 1, "Flex", "Samsung", "Japón", 7500.00);
        System.out.println(sw);
        
        System.out.println("");
        
        SmartDevice sd = new SmartPhone(50, 2, "Z3", "Poco", "China", 11500.50);
        System.out.println(sd);
        
    }

}
