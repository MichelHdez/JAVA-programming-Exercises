
public class Framework {
	String nombre;// key
	String lenguaje;
	double version;

	public Framework() {

	}

	public Framework(String nombre) {
		this.nombre = nombre;
	}

	public Framework(String nombre, String lenguaje, double version) {
		this.nombre = nombre;
		this.lenguaje = lenguaje;
		this.version = version;
	}

	@Override
	public String toString() {
		return "Framework [nombre=" + nombre + ", lenguaje=" + lenguaje + ", version=" + version + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

}
