// Creado Por Michel;

/*Agudo menor a 90°
Recto igual a 90°
Obtuso si es mayor que 90° pero menor que 180°
Llano si es igual a 180°
Concavo si es mayor que 180° pero menor que 360°*/;

class Angulo{

public static void main(String args[]){

	String nombre= "Agudo; Recto; Obtuso; Llano; Concavo";
	int angulo= 160;

	if (angulo<90){
		System.out.println("El lado es Agudo porque tiene un "+angulo+" de angulo");
		}
	else
		if (angulo==90){
			System.out.println("El lado es Recto porque tiene un "+angulo+" de angulo");
			}
		else
			if ((angulo>90)&&(angulo<180))
				System.out.println("El lado es Obtuso porque tiene un "+angulo+" de angulo");
			else
				if (angulo==180)
					System.out.println("El lado es Llano porque tiene un "+angulo+" de angulo");
				else
					if ((angulo>180)&&(angulo<360))
						System.out.println("El lado es Concavo porque tiene un "+angulo+" de angulo");
	}
}

