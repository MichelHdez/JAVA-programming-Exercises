package entrega.ejercicios.tema.pkg4;

public class SmartWatch extends SmartDevice {

    String color;

    public SmartWatch() {
    }

    public SmartWatch(String color, int codigo, String nombre, String marca, String paisorigen, double precio) {
        super(codigo, nombre, marca, paisorigen, precio);
        this.color = color;
    }

    public SmartWatch(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
