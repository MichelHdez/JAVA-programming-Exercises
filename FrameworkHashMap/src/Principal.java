import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;// key
		String lenguaje;
		double version;
		Framework frame;
		Scanner lec = null;
		int menu, menuE;

		Implementacion imp = new Implementacion();

		do {

 
		 
	 
			System.out.println("Bienvenidos a su Maquetadora de lenguajes Enucom");
			System.out.println("Menu de opciones");
			System.out.println("1)Alta");
			System.out.println("2)Editar");
			System.out.println("3)Eliminar");
			System.out.println("4)Buscar");
			System.out.println("5)Mostrar");
			System.out.println("6)Salir");
			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Alta de Frameworks");
				System.out.println("Escribe el  nombre del Framework: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el lenguaje:");
				lec = new Scanner(System.in);
				lenguaje = lec.nextLine();

				System.out.println("Escribe la version: ");
				lec = new Scanner(System.in);
				version = lec.nextDouble();
				frame = new Framework(nombre, lenguaje, version);
				imp.guardar(frame);
				System.out.println("Se guardo el framework: " + frame.getNombre());

				break;
			case 2:
				System.out.println("Escribe el nombre del framework: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				frame = (Framework) imp.buscar(new Framework(nombre));
				do {
					System.out.println("Opcion a editar");
					System.out.println("1)lenguaje");
					System.out.println("2)version");
					System.out.println("3)Menu Principal");
					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					switch (menuE) {
					case 1:
						System.out.println("Escribe el lenguaje nuevo: ");
						lec = new Scanner(System.in);
						lenguaje = lec.nextLine();
						frame.setLenguaje(lenguaje);
						break;
					case 2:
						System.out.println("Escribe la version nueva: ");
						lec = new Scanner(System.in);
						version = lec.nextDouble();
						frame.setVersion(version);
						break;

					}// switch editar
				} while (menuE < 3);
				imp.editar(frame);
				System.out.println("Se edito el framework " + frame);

				break;

			case 3:
				System.out.println("escribe el nombre del framework a eliminar: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				frame = (Framework) imp.buscar(new Framework(nombre));
				imp.eliminar(frame);
				System.out.println("Se elimino el framework: " + frame.getNombre());
				break;
			case 4:
				System.out.println("Escribe el nombre del Framework a buscar: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				frame = new Framework(nombre);
				frame = (Framework) imp.buscar(frame);
				System.out.println("framework encontrado->" + frame);
				break;
			case 5:
				imp.mostrar();
				break;
			case 6:
				System.out.println("Bye");
				break;

			}

		} while (menu < 6);

	}// fin main

}// clase fin principal
