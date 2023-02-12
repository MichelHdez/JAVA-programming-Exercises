import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		double precio;
		int porcion;
		String sabor;
		Sopa s = null;
		int menu,indice;
		
		Scanner lec = null;
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("**Menu de Sopa**");
			System.out.println("1)Alta");
			System.out.println("2)Editar");
			System.out.println("3)Eliminar");
			System.out.println("4)Buscar por indice");
			System.out.println("5)Buscar por nombre");
			System.out.println("6)Contar");
			System.out.println("7)Mostrar");
			System.out.println("8)Salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Alta de Sopas");
				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				System.out.println("Ingresa el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				
				System.out.println("Ingresa la porción");
				lec = new Scanner(System.in);
				porcion = lec.nextInt();
				
				System.out.println("Ingresa el sabor");
				lec = new Scanner(System.in);
				sabor = lec.nextLine();
				
				s = new Sopa(nombre,precio,porcion,sabor);
				imp.guardar(s);
				System.out.println("Se guardó la sopa :" +s);
				break;
				
			case 2:
				//antes de editar hay que buscar el elemento
				System.out.println("Elige la sopa a editar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				s.setNombre(nombre);
				System.out.println("Se editó la sopa " +s);
				break;
				
			case 3:
				System.out.println("Ingresa el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				s = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Se eliminó la sopa: " +s.getNombre());
				break;
				
			case 4:
				System.out.println("Ingresa el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				s = imp.buscar(indice);
				System.out.println("La sopa encontrada es: " +s);
				break;
				
			case 5:
				System.out.println("Escribe el nombre a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				s = new Sopa(nombre);
				imp.buscarNombre(s);
				break;
				
			case 6:
				imp.contar();
				break;
				
			case 7:
				imp.mostrar();
				break;
				
			case 8:
				System.out.println("Vuelva Pronto. Bye!!!!!");
				break;
				
			}
		}while(menu < 8);
	}//main
}//principal

