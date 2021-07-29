class Caseta{

public static void main(String args[]){

	char caseta='a';
	int pasajeros =2;
	switch(caseta){
	case  'a':
		monto1= 25;
	switch(pasajeros){
		case 1:
		monto1 =monto1+10;
		System.out.println("El precio es de "monto1+10" y su numero de pasajeros es "); break;
	}

	case  'b':
	monto2=10;
	switch(pasajeros){
		case 1:
		case 2:
			monto2 = monto2+15;
			System.out.println("El precio es de "monto2+15" y su numero de pasajeros es"); break;
	}
	

	case  'c':
	monto3=30;
	switch(pasajeros){
		case 1:
		case 2:
		case 3:
			monto3 = monto3+20;
			System.out.println("El precio es de "monto3+20" y su numero de pasajeros es"); break;
	}
		
		default:System.out.println("Error"); break;
	}
    }
}