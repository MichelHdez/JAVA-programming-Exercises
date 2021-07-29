class Ejercicio7{

public static void main(String args[]){

	
	double hypo = 0; 
	double base = 4; 
	double altura = 5;

	
	hypo = Math.sqrt(Math.pow(base,4) + Math.pow(altura,5));
	System.out.println("La hipotenusa de un triangulo de lados "+base+" y "+altura+" es " + Math.hypot(base,altura));


	}
}