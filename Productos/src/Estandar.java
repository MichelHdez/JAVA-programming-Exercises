public class Estandar extends Productos {

    String seccion;
    int unidades;

    public Estandar(){

    }

    public Estandar(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }


    @Override
    public String toString() {
        return "Estandar{" +
                "seccion='" + seccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void obtenerPrecioPedido(int unidades, double precio) {
        double precioFinal = unidades * precio; //precio inicial
        if (unidades >= 5) {
            double descuento = precioFinal * 0.10;
            precioFinal = precioFinal - descuento;
            System.out.println("El precio total con descuento es de: " + precioFinal + " pesos");
        } else {
            System.out.println("No aplica descuento");
        }
    }
}
