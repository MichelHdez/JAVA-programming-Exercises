class Ejercicio8{

public static void main (String args[]){

	double hypo = 0; 
	double cateto1 = 2; 
	double cateto2 = 3;

	hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	System.out.println("La hipotenusa de un triangulo de lados "+cateto1+" y "+cateto2+" es " + Math.hypot(cateto1, cateto2));


	}
}