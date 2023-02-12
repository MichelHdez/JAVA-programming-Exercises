
public class Equipo extends Atleta {
	String pais;
	String especialidad;
	String continente;

	public void competir() {
		System.out.println("Estamos compitiendo");
	}

	public Equipo() {

	}

	public Equipo(String nombre, String apaterno, double estatura, String pais, String especialidad,
			String continente) {
		super(nombre, apaterno, estatura);
		this.pais = pais;
		this.especialidad = especialidad;
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", apaterno=" + apaterno + ", estatura=" + estatura + ", pais=" + pais
				+ ", especialidad=" + especialidad + ", continente=" + continente + "]";
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

}
