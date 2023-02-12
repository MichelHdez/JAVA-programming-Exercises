
public class Transporte {
	String nombre; // key
	String tipo;
	double costo;
	int pasajeros;

	public Transporte() {

	}
	
	public Transporte(String nombre) {
		this.nombre = nombre;
	}

	public Transporte(String nombre, String tipo, double costo, int pasajeros) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Transporte [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", pasajeros=" + pasajeros
				+ "\n]";
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

}
