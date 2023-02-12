
public class Mascota {
	String nombre;//key
	String tipo;
	int edad;

	public Mascota() {

	}

	public Mascota(String nombre) {
		this.nombre = nombre;
	}

	public Mascota(String nombre, String tipo, int edad) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
