
public class Alumna {
	String nombre;
	String app;
	int edad;

	public Alumna() {

	}

	public Alumna(String nombre, String app, int edad) {
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumna [nombre=" + nombre + ", app=" + app + ", edad=" + edad + "\n]";
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

}
