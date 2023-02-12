
public class Cuadrado implements Figura, Dibujable {
	private double lado;	
	
	public Cuadrado() {
		
	}


	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}


	public void dibujar() {
		System.out.println("Estoy dibujando un cuadrado");
		
	}
}
