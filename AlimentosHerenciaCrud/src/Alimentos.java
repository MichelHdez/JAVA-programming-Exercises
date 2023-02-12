
public class Alimentos {
	private String nombre;
	private double calorias;
	private double precio;
	
	public Alimentos() {
		
	}

	public Alimentos(String nombre, double calorias, double precio) {
		this.nombre = nombre;
		this.calorias = calorias;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Alimentos [nombre=" + nombre + ", calorias=" + calorias + ", precio=" + precio + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
}
