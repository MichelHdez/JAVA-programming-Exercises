class Ejercicio2 {

public static void main(String args[]){
		
		double radio = 6;
		double area;
		double perimetro;

		
		perimetro=2*Math.PI*radio;		
		System.out.println("El perimetro de la circunferencia de "+radio+" es "+perimetro); 		


		area = Math.PI * Math.pow(radio,2);
		System.out.println("El área de un circulo de radio "+radio+" es "+area);
	}

}
