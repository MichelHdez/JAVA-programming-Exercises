class Edad{

public static void main(String args[]){

	String nombre= "Cosme Fulanito";
	int edad= 53;

	if (edad<18){ 
		System.out.println("El individuo "+nombre+" es NIÑO porque tiene "+edad+" de edad");
		}
	else
		if((edad>=18)&&(edad<30)){
			System.out.println("El individuo "+nombre+" es JOVEN porque tiene "+edad+" de edad");
			}
		else 
			if(edad>=30)
				System.out.println("El individuo "+nombre+" es ADULTO porque tiene "+edad+" de edad");
	}
}
