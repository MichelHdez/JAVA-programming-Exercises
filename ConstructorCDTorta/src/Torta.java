
public class Torta {
	String nombre;
	String region;
	double precio;

	public Torta() {// constructor sin parametros para inicializar

	}

	public Torta(String nombre, String region, double precio) {
		this.nombre = nombre;
		this.region = region;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", region=" + region + ", precio=" + precio + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
