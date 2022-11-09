
public class Cereal {

	String nombre;
	String marca;
	double precio;
	int conte;

	public Cereal() {

	}

	public Cereal(String nombre, String marca, double precio, int conte) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.conte = conte;
	}

	@Override
	public String toString() {
		return "Cereal [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", conte=" + conte + "]\n";
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

	public int getConte() {
		return conte;
	}

	public void setConte(int conte) {
		this.conte = conte;
	}

}
