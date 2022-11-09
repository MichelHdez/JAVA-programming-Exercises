import java.util.*;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		String marca;
		double precio;
		int conte;
		Cereal cereal = null;
		Scanner lec = null;
		int menu, menuE, indice;
		List<Cereal> lista = new ArrayList<Cereal>();

		do {
			System.out.println("Bienvenidos a su distribuidor de cereal Enucom");
			System.out.println("*** menu ***");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 elimnar");
			System.out.println("4 buscar");
			System.out.println("5 mostrar");
			System.out.println("6 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("alta de Cereal");

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe la marca");
				lec = new Scanner(System.in);
				marca = lec.nextLine();

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe el contenido");
				lec = new Scanner(System.in);
				conte = lec.nextInt();

				cereal = new Cereal(nombre, marca, precio, conte);
				lista.add(cereal);
				System.out.println("se guardo el cereal " + cereal.getNombre());
				break;
			case 2:
				System.out.println("Buscar por indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal = lista.get(indice);
				do {
					System.out.println("Escoge por que deceas editar");
					System.out.println("1 marca");
					System.out.println("2 contenido");
					System.out.println("3 Menu Principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("Escribe la marca nueva");
						lec = new Scanner(System.in);
						marca = lec.nextLine();
						cereal.setMarca(marca);
						break;
					case 2:
						System.out.println("Escribe el contenido nuevo");
						lec = new Scanner(System.in);
						conte = lec.nextInt();
						cereal.setConte(conte);
						break;
					}// cierra switch Editar
				} while (menuE < 3);
				lista.set(indice, cereal);
				System.out.println("Se edito el cereal " + cereal);
				break;
			case 3:
				System.out.println("Buscar por indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal = lista.get(indice);
				lista.remove(indice);
				System.out.println("Se elmino el cereal " + cereal);
				break;
			case 4:
				System.out.println("Buscar por indice");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal = lista.get(indice);
				System.out.println("Se encontro el cereal " + cereal);
				break;
			case 5:
				System.out.println(lista);
				break;
			case 6:
				System.out.println("Gracias por vicitarnos!!!");
				break;
			}// cierra menu
		} while (menu < 6);
	}// cierra main
	
	//guardar, editar, eliminar, buscar, listar
	
	/*
	 * Interface->guardar
	 * 
	 * Alejandro->insertar
	 * David -> save
	 * Sebastaian->guardarPerro
	 * Stefania->alta
	 * */
}// cierra clase
