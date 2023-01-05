import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int menu = 0;
		Scanner lec = null;

		do {
			try {
				System.out.println("Menu");
				System.out.println("1)Alta");
				System.out.println("2)Mostrar");
				System.out.println("3)Salir");
				lec = new Scanner(System.in);
				menu = lec.nextInt();
				if (menu==1) {
					System.out.println("opcion alta");
				} else if(menu==2){
					System.out.println("opcion mostrar");
				} else {
					System.out.println("bye");
				}
				
			} catch (Exception e) {
				System.out.println("error->" + e + ", favor de intentar de nuevo");
			}
		}while(menu < 3);
	}//main
}//principal
