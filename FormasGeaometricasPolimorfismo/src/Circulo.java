
public class Circulo extends Forma {
	String longitud;

	public Circulo() {

	}

	public Circulo(String nombre, String longitud) {
		super(nombre);
		this.longitud = longitud;
	}

	public void MostrarNombre() {
		System.out.println("Est� es la clase Hijo llamada " + nombre);
	}

}
