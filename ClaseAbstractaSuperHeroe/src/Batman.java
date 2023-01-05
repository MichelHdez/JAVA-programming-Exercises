
public class Batman extends SuperHeroes {

	String colorTraje;

	@Override
	public void trabajar() {
		System.out.println("Estoy invirtiendo mi dinero");
	}

	public void investigar() {
		System.out.println("Estoy investigando");
	}

	public Batman() {

	}

	public Batman(String nombre, String app, String nomHeroe, String poder, String ciudad, String colorTraje) {
		super(nombre, app, nomHeroe, poder, ciudad);
		this.colorTraje = colorTraje;
	}

	@Override
	public String toString() {
		return "Batman [nombre=" + nombre + ", app=" + app + ", nomHeroe=" + nomHeroe + ", poder=" + poder + ", ciudad="
				+ ciudad + ", colorTraje=" + colorTraje + "]";
	}

	public String getColorTraje() {
		return colorTraje;
	}

	public void setColorTraje(String colorTraje) {
		this.colorTraje = colorTraje;
	}

}
