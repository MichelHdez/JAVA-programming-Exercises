
public class Saxofon extends Instrumento{
	String tipo;
	
	public Saxofon() {
		
	}

	public Saxofon(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public void Tocar() {
		System.out.println("Este instrumento es de tipo viento: " + nombre);
	}
}
