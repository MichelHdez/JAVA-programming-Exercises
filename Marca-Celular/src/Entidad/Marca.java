package Entidad;

public class Marca {

	String nombre;
	String pais;
	String slogan;

	public Marca() {

	}

	public Marca(String nombre) {
		this.nombre = nombre;
	}
	
	public Marca(String nombre, String pais, String slogan) {
		this.nombre = nombre;
		this.pais = pais;
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return "Marca [nombre=" + nombre + ", pais=" + pais + ", slogan=" + slogan + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}
