
public class Jugador {

	int clave;
	String nombre;
	String app;
	int edad;
	String equipo;

	public Jugador() {
	}

	public Jugador(int clave) {
		this.clave = clave;
	}


	public Jugador(int clave, String nombre, String app, int edad, String equipo) {
		this.clave = clave;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [clave=" + clave + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", equipo="
				+ equipo + "]\n";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}
