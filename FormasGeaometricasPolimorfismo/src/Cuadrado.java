
public class Cuadrado extends Forma{
	String longitud;
	
	public Cuadrado() {
		
	}

	public Cuadrado(String nombre, String longitud) {
		super(nombre);
		this.longitud = longitud;
	}
	
	public void MostrarNombbre() {
		System.out.println("Est� es la clase hijo llamada: " +nombre);
	}
}
