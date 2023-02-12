
public class Padre {
	protected String nombre;
	protected String app;
	protected String apm;
	protected int edad;

	public void trabajar(String trabajo) {
		System.out.println("Trabajando en..." + trabajo);
	}

	public Padre() {

	}

	public Padre(String nombre, String app, String apm, int edad) {
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", edad=" + edad + "\n]";
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

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
