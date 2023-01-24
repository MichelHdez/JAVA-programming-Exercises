package entrega.ejercicios.tema.pkg4;

public class SmartDevice {

    int codigo;
    String nombre;
    String marca;
    String paisorigen;
    double precio;

    public SmartDevice() {
    }

    public SmartDevice(int codigo, String nombre, String marca, String paisorigen, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.paisorigen = paisorigen;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", paisorigen=" + paisorigen + ", precio=" + precio + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
