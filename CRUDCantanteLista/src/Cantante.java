
public class Cantante {
	String nombre;
	String app;
	String nomArt;
	int edad;
	String genero;

	public Cantante() {

	}

	public Cantante(String nombre, String app, String nomArt, int edad, String genero) {

		this.nombre = nombre;
		this.app = app;
		this.nomArt = nomArt;
		this.edad = edad;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", app=" + app + ", nomArt=" + nomArt + ", edad=" + edad + ", genero="
				+ genero + "]";
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

	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
