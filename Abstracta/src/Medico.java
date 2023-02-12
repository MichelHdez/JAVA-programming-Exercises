
public class Medico extends Profesionista {
	String colorBata;
	String especialidad;

	@Override
	public void trabajar() {
		System.out.println("Dando Paracetamol");
	}

	public void consultar() {
		System.out.println("El diagnostico es que si eres positivo de covid ");
	}

	public Medico() {

	}	

	public Medico(String nombre, String app, String titulo, String cedula, String universidad, String colorBata,
			String especialidad) {
		super(nombre, app, titulo, cedula, universidad);
		this.colorBata = colorBata;
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", colorBata=" + colorBata + ", especialidad=" + especialidad + "]";
	}

	public String getColorBata() {
		return colorBata;
	}

	public void setColorBata(String colorBata) {
		this.colorBata = colorBata;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
