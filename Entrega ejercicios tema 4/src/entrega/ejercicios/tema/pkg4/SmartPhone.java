package entrega.ejercicios.tema.pkg4;

public class SmartPhone extends SmartDevice {

    int pixeles;

    public SmartPhone() {
    }

    public SmartPhone(int pixeles, int codigo, String nombre, String marca, String paisorigen, double precio) {
        super(codigo, nombre, marca, paisorigen, precio);
        this.pixeles = pixeles;
    }

    public SmartPhone(int pixeles) {
        this.pixeles = pixeles;
    }

    public int getPixeles() {
        return pixeles;
    }

    public void setPixeles(int pixeles) {
        this.pixeles = pixeles;
    }

}
