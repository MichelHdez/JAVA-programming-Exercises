
public class Hija extends Padre {

	String hobbie;
	String estudio;
	double estatura;

	public void estudiar() {
		System.out.println("Viendo Youtube");
	}

	public Hija() {
	}

	public Hija(String nombre, String app, String apm, int edad, String hobbie, String estudio, double estatura) {
		super(nombre, app, apm, edad);
		this.hobbie = hobbie;
		this.estudio = estudio;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Hija [nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", edad=" + edad + ", hobbie=" + hobbie
				+ ", estudio=" + estudio + ", estatura=" + estatura + "\n]";
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
