
public class Instrumento {
	String nombre;

	public Instrumento() {

	}

	public Instrumento(String nombre) {
		this.nombre = nombre;
	}

	public void Tocar() {
		System.out.println("Estas son categorias de instrumento : " + nombre);
	}
}
