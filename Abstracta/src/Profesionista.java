
public abstract class Profesionista {
	String nombre;
	String app;
	String titulo;
	String cedula;
	String universidad;

	// metodo no abstracto
	public void cobrar(String tipo, double cantidad) {
		System.out.println("Me pagaron en: " + tipo + "la cantidad de " + cantidad);
	}

	// metodo abstracto
	public abstract void trabajar();

	public Profesionista() {

	}

	public Profesionista(String nombre, String app, String titulo, String cedula, String universidad) {
		this.nombre = nombre;
		this.app = app;
		this.titulo = titulo;
		this.cedula = cedula;
		this.universidad = universidad;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
