
public class Violin extends Instrumento{
	String tipo;
	
	public Violin() {
		
	}
	
	public Violin(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}



	public void Tocar() {
		System.out.println("Este instrumento es de tipo cuerdas: " + nombre);
	}
}
