
public class Sopa {
	String nombre;
	double precio;
	int porcion;
	String sabor;

	public Sopa() {
		
	}

	public Sopa(String nombre) {
		this.nombre = nombre;
	}

	public Sopa(String nombre, double precio, int porcion, String sabor) {
		this.nombre = nombre;
		this.precio = precio;
		this.porcion = porcion;
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Sopa [nombre=" + nombre + ", precio=" + precio + ", porcion=" + porcion + ", sabor=" + sabor + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPorcion() {
		return porcion;
	}

	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
