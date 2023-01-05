package Entidad;

public class Celular {

	String modelo;
	String so;
	double precio;
	String marca;

	public Celular() {

	}

	public Celular(String modelo) {
		this.modelo = modelo;
	}

	public Celular(String modelo, String so, double precio, String marca) {
		super();
		this.modelo = modelo;
		this.so = so;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", so=" + so + ", precio=" + precio + ", marca=" + marca + "]\n";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
