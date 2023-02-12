
public class Equipo {

	// Buscar por equipo

	int clave;
	String nombreEquipo;
	String trofeos;
	int anios;

	public Equipo() {
	}

	public Equipo(int clave) {
		this.clave = clave;
	}

	public Equipo(int clave, String nombreEquipo, String trofeos, int anios) {
		super();
		this.clave = clave;
		this.nombreEquipo = nombreEquipo;
		this.trofeos = trofeos;
		this.anios = anios;
	}

	@Override
	public String toString() {
		return "Equipo [clave=" + clave + ", nombreEquipo=" + nombreEquipo + ", trofeos=" + trofeos + ", anios=" + anios
				+ "]";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getTrofeos() {
		return trofeos;
	}

	public void setTrofeos(String trofeos) {
		this.trofeos = trofeos;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

}
