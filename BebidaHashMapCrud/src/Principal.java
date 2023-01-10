import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int clave; // key
		String bebida;
		double precio;
		String alcohol;
		Bebida b = null;
		int menu, menuE;
		Implementacion imp = new Implementacion();
		Scanner lec = null;

		do {
			System.out.println("Bienvenidos a su tienda de bebidas Enucom");
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
				System.out.println("ALTA DE BEBIDAS");
				System.out.println("Escribe la clave:");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				System.out.println("Escribe el nombre: ");
				lec = new Scanner(System.in);
				bebida = lec.nextLine();
				System.out.println("Escribe el precio: ");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				System.out.println("Escribe si tiene alcohol: ");
				lec = new Scanner(System.in);
				alcohol = lec.nextLine();
				b = new Bebida(clave, bebida, precio, alcohol);
				imp.guardar(b);
				System.out.println("Se guardo la bebida: " + b.getBebida());
				break;
			case 2:
				System.out.println("Escribe la clave de la bebida a editar: ");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				b = new Bebida(clave);
				b = imp.buscar(b);
				System.out.println("Escribe el nuevo precio:");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				b.setPrecio(precio);
				imp.editar(b);
				System.out.println("Se edito la bebida: " + b);

				break;
			case 3:
				System.out.println("Escribe la clave de la bebida a eliminar: ");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				b = new Bebida(clave);
				b = imp.buscar(b);
				imp.eliminar(b);
				System.out.println("se elimino la bebida: " + b);
				break;
			case 4:
				System.out.println("Escribe la clave de la bebida a buscar: ");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				b = new Bebida(clave);
				b = imp.buscar(b);
				System.out.println("bebida encontrada->" + b);

				break;
			case 5:
				imp.mostrar();
				break;
			case 6:
				System.out.println("Bye");
				break;

			}// switch

		} while (menu < 6);

	}// fin main

}// fin clase principal
