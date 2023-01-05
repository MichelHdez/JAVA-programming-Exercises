public abstract class Productos {
    String nombre;
    double precio;
    double precioFinal;
    int unidades;

    public Productos() {
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", precioFinal=" + precioFinal +
                ", unidades=" + unidades +
                '}';
    }

    public abstract void obtenerPrecioPedido(int unidades, double precio);
}
