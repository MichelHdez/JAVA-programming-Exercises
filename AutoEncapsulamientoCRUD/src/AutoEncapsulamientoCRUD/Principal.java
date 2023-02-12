package AutoEncapsulamientoCRUD;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String modelo;
		String marca;
		double precio;
		int puertas, menu;
		Auto auto = null;
		Scanner lec = null;

		do {
			System.out.println("Bienvenidos a Enucom-->Encapsulamiento");
			System.out.println("Menu");
			System.out.println("1)Alta");
			System.out.println("2)Mostrar");
			System.out.println("3)Editar precio");
			System.out.println("4)Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Alta de autos");
				System.out.println("Escribe el modelo: ");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();
				System.out.println("Escribe la marca: ");
				lec = new Scanner(System.in);
				marca = lec.nextLine();
				System.out.println("Escribe el precio: ");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				System.out.println("Escribe el numero de puertas: ");
				lec = new Scanner(System.in);
				puertas = lec.nextInt();

				auto = new Auto();
				auto.setModelo(modelo);
				auto.setMarca(marca);
				auto.setPrecio(precio);
				auto.setPuertas(puertas);
				System.out.println("El auto " + auto.getModelo() + " se dio de alta");

				break;

			case 2:
				System.out.println("Los datos del auto son: ");
				System.out.println("Modelo->" + auto.getModelo());
				System.out.println("Marca->" + auto.getMarca());
				System.out.println("Precio->" + auto.getPrecio());
				System.out.println("Puertas->" + auto.getPuertas());
				break;

			case 3:
				System.out.println("Escribe el precio nuevo: ");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				auto.setPrecio(precio);
				System.out.println("Se edito el precio");

				break;

			case 4:
				System.out.println("Bye");
				break;

			}// fin switch

		} while (menu < 4);

	}// fin main

}// fin clase principal
