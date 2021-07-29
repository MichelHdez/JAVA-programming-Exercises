class Ejercicio9{

public static void main(String args[]){

	double S=0, Area=0;
	double cateto1 = 4; 
	double cateto2 = 10;
	double cateto3 = 12;

	
	S=(cateto1+cateto2+cateto3)/2;
	Area=(Math.sqrt*(cateto1-2)*(cateto2-2)*(cateto3-2));
	System.out.println("El area de un triangulo de lados "+cateto1+" "+cateto2+" y "+cateto3+" es "+Area);


	}
}