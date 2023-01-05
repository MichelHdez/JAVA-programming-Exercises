public class Ofertado extends Productos{

    int dias;

    public Ofertado() {
    }

    public Ofertado(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Ofertado{" +
                "dias=" + dias +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void obtenerPrecioPedido(int dias, double precio) {
        double precioFinal = dias * precio; //precio inicial
        if (dias == 1) {
            double descuento = precioFinal * 0.20;
            precioFinal = precioFinal - descuento;
            System.out.println("El precio total con descuento del 20% es de: " + precioFinal + " pesos");
        } else if (dias == 2 || dias == 3) {
            double descuento = precioFinal * 0.15;
            precioFinal = precioFinal - descuento;
            System.out.println("El precio total con descuento del 15% es de: " + precioFinal + " pesos");
        } else if (dias > 3){
            double descuento = precioFinal * 0.10;
            precioFinal = precioFinal - descuento;
            System.out.println("El precio total con descuento del 10% es de: " + precioFinal + " pesos");
        }
    }
}
