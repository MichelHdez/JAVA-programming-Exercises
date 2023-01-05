
public class Cereal {
	String nombre;
	String marca;
	double precio;
	int contenido;

	public Cereal() {
	}

	public Cereal(String nombre, String marca, double precio, int contenido) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Cereal [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", contenido=" + contenido
				+ "\n]";
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

}
