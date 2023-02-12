
public class Salon {

	private String clave;
	private String estatus;

	public Salon() {

	}

	public Salon(String clave, String estatus) {
		this.clave = clave;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Salon [clave=" + clave + ", estatus=" + estatus + "]";
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
