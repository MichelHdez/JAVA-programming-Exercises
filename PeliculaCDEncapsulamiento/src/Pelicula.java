
public class Pelicula {
	String nombre;
	String director;
	double duracion;
	String genero;

	public Pelicula() {

	}

	public Pelicula(String nombre, String director, double duracion, String genero) {
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + ", genero=" + genero
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
