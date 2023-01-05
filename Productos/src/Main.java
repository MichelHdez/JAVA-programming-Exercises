public class Main {
    public static void main(String[] args) {

        System.out.println("Productos Estandar");
        Estandar e1 = new Estandar("Galletas", 200, "Dulces");
        Estandar e2 = new Estandar("Café", 90, "Abarrotes");
        System.out.println(e1);
        System.out.println(e2);
        e1.obtenerPrecioPedido(5, 200.00);
        e2.obtenerPrecioPedido(4, 90.00);

        System.out.println("");

        System.out.println("Productos Ofertados");
        Ofertado o1 = new Ofertado("Vasos", 1700, 2);
        Ofertado o2 = new Ofertado("Platos", 5000, 2);
        Ofertado o3 = new Ofertado("Jugos", 2500, 2);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        o1.obtenerPrecioPedido(2, 1700);
        o2.obtenerPrecioPedido(2, 5000);
        o3.obtenerPrecioPedido(2, 2500);

    }
}