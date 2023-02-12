
public class IngSistemas extends Profesionista{

	String tipo;
	String lenguaje;
	String framework;
	
	@Override
	public void trabajar() {
		System.out.println("Haciendo un Hola Mundo!!!! para el cliente");
		
	}
	
	public void codeando() {
		System.out.println("Viendo tutoriales");
	}
	
	public IngSistemas() {
		
	}

	public IngSistemas(String nombre, String app, String titulo, String cedula, String universidad, String tipo,
			String lenguaje, String framework) {
		super(nombre, app, titulo, cedula, universidad);
		this.tipo = tipo;
		this.lenguaje = lenguaje;
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "IngSistemas [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", tipo=" + tipo + ", lenguaje=" + lenguaje + ", framework="
				+ framework + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}
	
	
}
