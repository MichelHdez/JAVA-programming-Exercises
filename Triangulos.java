class Triangulos{

public static void main(String args[]){

	int a=3, b=3, c=3;

	if((a==b)&&(b==c)&&(c==a)){
		System.out.println("El triangulo es Equilatero");
		}	
	else
		if((a!=b)&&(b!=c)&&(c!=a))
			System.out.println("El triangulo es Escaleno");
		else
				System.out.println("El triangulo es Isoceles");
		}

}

