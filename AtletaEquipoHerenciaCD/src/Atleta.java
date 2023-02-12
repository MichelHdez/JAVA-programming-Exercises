
public class Atleta {
	String nombre;
	String apaterno;
	double estatura;

	public void entrenar(String entrena) {
		System.out.println("Entrenando en..." + entrena);
	}

	public Atleta() {

	}

	public Atleta(String nombre, String apaterno, double estatura) {
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", apaterno=" + apaterno + ", estatura=" + estatura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
