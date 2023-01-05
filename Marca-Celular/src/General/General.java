package General;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Entidad.Celular;
import Entidad.Marca;
import Implementacion.Implementacion;

public class General {

	public static void main(String[] args) {
		String nombre;// Marca
		String pais;
		String slogan;

		String modelo;// Celular
		String so;
		double precio;
		String marca;

		Marca mar = null;
		Celular cel = null;
		int menu, opcion;
		Scanner lec = null;
		Implementacion imp = new Implementacion();

		
		do {
			System.out.println("Bienvenido a su Tienda de Celulares");
			System.out.println("*Menu de Opciones*");
			System.out.println("1)Alta Código Duro");
			System.out.println("2)Editar Celular");
			System.out.println("3)Eliminar Celular");
			System.out.println("4)Buscar");
			System.out.println("5)Buscar por marca");
			System.out.println("6)Contar");
			System.out.println("7)Mostrar");
			System.out.println("8)Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:		
				Marca pos1 = new Marca("Samsung", "Corea del Sur", "Imagine");
				Marca pos2 = new Marca("Apple", "EEUU", "Think Different");
				Marca pos3 = new Marca("Motorola", "EEUU", "Hello Moto");
				Marca pos4 = new Marca("Oppo", "China", "Inspiration Ahead");
				Marca pos5 = new Marca("Honor", "EEUU", "For The Brave ");
				HashSet marcas = new HashSet<Marca>();
				marcas.add(pos1);
				marcas.add(pos2);
				marcas.add(pos3);
				marcas.add(pos4);
				marcas.add(pos5);
				System.out.println(marcas);
				
				System.out.println("Alta de Celular");
				System.out.println("Escribe el Modelo: ");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();

				System.out.println("Ingresa el SO:");
				lec = new Scanner(System.in);
				so = lec.nextLine();

				System.out.println("Escribe el precio:");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe la marca:");
				lec = new Scanner(System.in);
				marca = lec.nextLine();

				cel = new Celular(modelo, so, precio, marca);
				imp.guardar(cel);
				System.out.println("Se guardo el Celular: " + cel);
				break;
			case 2:
				System.out.println("Escribe el modelo a editar: ");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();
				cel = new Celular(modelo);
				cel = (Celular) imp.buscar(cel);
				do {
					System.out.println("Opcion a editar");
					System.out.println("1)Precio");
					System.out.println("2)Menu Principal");
					lec = new Scanner(System.in);
					opcion = lec.nextInt();
					switch (opcion) {
					case 1:
						System.out.println("Escribe el nuevo Precio a Editar: ");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						cel.setPrecio(precio);
		                System.out.println("Se actualizó el precio");
		                System.out.println(cel);
						break;
					}// switch
				} while (opcion < 2);
				imp.editar(cel);
				System.out.println(cel);
				break;
			case 3:
				System.out.println("Escribe el modelo del Celular a eliminar: ");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();
				cel = new Celular(modelo);
				cel = (Celular) imp.buscar(cel);
				imp.eliminar(cel);
				System.out.println("Se elimino el Celular: " + cel);
				break;
			case 4:
				System.out.println("Escribe el modelo de Celular a buscar: ");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();
				cel = new Celular(modelo);
				cel = (Celular) imp.buscar(cel);
				System.out.println("Celular encontrado->" + cel);
				break;
			case 5:
				System.out.println("Escribe la marca del Celular a buscar: ");
				lec = new Scanner(System.in);
				marca = lec.nextLine();
				mar = new Marca();
				mar = (Marca) imp.buscarPorMarca(mar);
				System.out.println("Celular encontrado->" + mar);
				break;
			case 6:
				imp.contar();
				break;
			case 7:
				imp.mostrar();
				break;
			case 8:
				System.out.println("Vuelva pronto. Chao!!!");
				break;
			}
		} while (menu < 8);
	}// main
}
