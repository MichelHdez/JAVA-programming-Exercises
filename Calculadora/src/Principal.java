import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a;
		int b;
		int resultado;
		int menu = 0;
		Scanner lec = null;
		
		do {
			try {
				System.out.println("Menu");
				System.out.println("1)Suma");
				System.out.println("2)Restar");
				System.out.println("3)Multiplicacion");
				System.out.println("4)Division");
				System.out.println("5)Salir");
				lec = new Scanner(System.in);
				menu = lec.nextInt();
				switch(menu) {
				case 1:
					try {
						System.out.println("Ingresa los valores para la Suma");
						System.out.println("Ingresa el primer valor");
						lec = new Scanner(System.in);
						a = lec.nextInt();
						
						System.out.println("Ingresa el segundo valor");
						lec = new Scanner(System.in);
						b = lec.nextInt();
						
						resultado = a + b;
						System.out.println( "La suma de a y b es: " + resultado);
						break;
					} catch (Exception e) {
						System.out.println("Error->" + e + ", valores para la suma no son v�lidos");
					}
					break;
				case 2:
					try {
						System.out.println("Ingresa los valores para la Resta");
						System.out.println("Ingresa el primer valor");
						lec = new Scanner(System.in);
						a = lec.nextInt();
						
						System.out.println("Ingresa el segundo valor");
						lec = new Scanner(System.in);
						b = lec.nextInt();
						
						resultado = a - b;
						System.out.println( "La resta de a y b es: " + resultado);
						break;
					} catch (Exception e) {
						System.out.println("Error->" + e + ", valores para la resta no son v�lidos");
					}
					break;
					
				case 3:
					try {
						System.out.println("Ingresa los valores para la Multiplicaci�n");
						System.out.println("Ingresa el primer valor");
						lec = new Scanner(System.in);
						a = lec.nextInt();
						
						System.out.println("Ingresa el segundo valor");
						lec = new Scanner(System.in);
						b = lec.nextInt();
						
						resultado = a * b;
						System.out.println( "La multiplicaci�n de a y b es: " + resultado);
						break;
					} catch (Exception e) {
						System.out.println("Error->" + e + ", valores para multiplicaci�n no son v�lidos");
					}
					break;
					
				case 4:
					try {
						System.out.println("Ingresa los valores para la Divisi�n");
						System.out.println("Ingresa el primer valor");
						lec = new Scanner(System.in);
						a = lec.nextInt();
						
						System.out.println("Ingresa el segundo valor");
						lec = new Scanner(System.in);
						b = lec.nextInt();
						
						resultado = a / b;
						System.out.println( "La divisi�n de a y b es: " + resultado);
						break;
					} catch (ArithmeticException e) {
						System.out.println("Error->" + e + ", valores para divis�n no son v�lidos");
					}
					break;
					
				case 5:
					System.out.println("Regrese pronto. Chao");
					break;
				}
			} catch (Exception ex) {
				System.out.println("error->" + ex + ", Favor de ingresar una operaci�n del men�");
			}
		}while(menu < 5);
	}
}
