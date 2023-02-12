
public class Zapato {
	String nombre;
	String estilo;
	String color;
	double precio;

	public Zapato() {
	}

	public Zapato(String nombre, String estilo, String color, double precio) {
		this.nombre = nombre;
		this.estilo = estilo;
		this.color = color;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Zapato [nombre=" + nombre + ", estilo=" + estilo + ", color=" + color + ", precio=" + precio + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
