
public class Circulo extends Forma {
	String longitud;

	public Circulo() {

	}

	public Circulo(String nombre, String longitud) {
		super(nombre);
		this.longitud = longitud;
	}

	public void MostrarNombre() {
		System.out.println("Está es la clase Hijo llamada " + nombre);
	}

}
