
public class SpiderMan extends SuperHeroes {

	String especialidad;
	int edad;

	@Override
	public void trabajar() {
		System.out.println("Estoy repartiendo pizzas");

	}

	public void entrenar() {
		System.out.println("Estoy entrenando");
	}

	public SpiderMan() {

	}

	public SpiderMan(String nombre, String app, String nomHeroe, String poder, String ciudad, String especialidad,
			int edad) {
		super(nombre, app, nomHeroe, poder, ciudad);
		this.especialidad = especialidad;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SpiderMan [nombre=" + nombre + ", app=" + app + ", nomHeroe=" + nomHeroe + ", poder=" + poder
				+ ", ciudad=" + ciudad + ", especialidad=" + especialidad + ", edad=" + edad + "]";
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
