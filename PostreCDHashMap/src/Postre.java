
public class Postre {
	String nombre;//key
	double precio;
	int calorias;
	
	public Postre() {
		
	}
	
	public Postre(String nombre) {
		this.nombre = nombre;
	}

	public Postre(String nombre, double precio, int calorias) {
		this.nombre = nombre;
		this.precio = precio;
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Postre [nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + "\n]";
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

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	
}
