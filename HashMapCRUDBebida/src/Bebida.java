
public class Bebida {
	int clave;// key
	String bebida;
	double precio;
	String alcohol;

	public Bebida() {

	}
	
	public Bebida(int clave) {
		this.clave = clave;
	}

	public Bebida(int clave, String bebida, double precio, String alcohol) {
		this.clave = clave;
		this.bebida = bebida;
		this.precio = precio;
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return "Bebida [clave=" + clave + ", bebida=" + bebida + ", precio=" + precio + ", alcohol=" + alcohol + "\n]";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

}
