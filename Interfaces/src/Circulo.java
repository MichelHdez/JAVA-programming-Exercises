
public class Circulo implements Figura, Dibujable, Rotable {
	private double radio;
	
	public Circulo() {
	}	

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio;
		return resultado;
	}

	public void rotar() {
		System.out.println("Estoy rotando un circulo");
	}

	public void dibujar() {
		System.out.println("Estoy dibujando un circulo");
		
	}
}
