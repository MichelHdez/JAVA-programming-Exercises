class Calificacion{

public static void main(String args[]){

	int calificacion =10;

	switch (calificacion){
	case 10:System.out.println("(A) Excelente"); break;
	case 9:
	case 8:
		System.out.println("(B) Bien"); break;
	case 7:
		System.out.println("(C) Regular"); break;
	case 6:
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
		System.out.println("(D) Malo"); break;
	}
    }
}