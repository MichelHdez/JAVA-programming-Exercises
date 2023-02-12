import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre; // key
		String tipo;
		double costo;
		int pasajeros;
		Transporte trans = null;
		Scanner lec = null;
		int menu, opcion;
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("Bienvenido a Transporte del Centro");
			System.out.println("**Menu**");
			System.out.println("1)Alta");
			System.out.println("2)Editar");
			System.out.println("3)Eliminar");
			System.out.println("4)Buscar");
			System.out.println("5)Mostrar");
			System.out.println("6)Salir");
		
		lec = new Scanner(System.in);
		menu = lec.nextInt();
		switch(menu) {
		case 1:
			System.out.println("Alta de Transportes");
			System.out.println("Escribe el nombre del Transporte");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			
			System.out.println("Escribe el tipo");
			lec = new Scanner(System.in);
			tipo = lec.nextLine();
			
			System.out.println("Escribe el costo del Transporte");
			lec = new Scanner(System.in);
			costo = lec.nextDouble();
			
			System.out.println("Escribe la cantidad de pasajeros");
			lec = new Scanner(System.in);
			pasajeros = lec.nextInt();
			
			trans = new Transporte(nombre,tipo,costo,pasajeros);
			imp.guardar(trans);
			System.out.println("Se guardo el framework: " + trans.getNombre());
			break;
			
		case 2:
			System.out.println("Escribe el nombre del transporte: ");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			trans = (Transporte) imp.buscar(new Transporte(nombre));
			do {
				System.out.println("Opcion a editar");
				System.out.println("1)Tipo");
				System.out.println("2)Costo");
				System.out.println("3)Menu Principal");
				lec = new Scanner(System.in);
				opcion = lec.nextInt();
				switch(opcion) {
				case 1:
					System.out.println("Escribe el nuevo tipo: ");
					lec = new Scanner(System.in);
					tipo = lec.nextLine();
					trans.setTipo(tipo);
					break;
				case 2:
					System.out.println("Escribe el nuevo costo: ");
					lec = new Scanner(System.in);
					costo = lec.nextDouble();
					trans.setCosto(costo);
					break;
				}//
			}while(opcion < 3);
			imp.editar(trans);
			System.out.println("Se edito el transporte " + trans);
			break;
			
		case 3:
			System.out.println("Ingresa el nombre del transporte a eliminar");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			trans =  (Transporte) imp.buscar(new Transporte(nombre));
			imp.eliminar(trans);
			System.out.println("Se elimino el transporte: " + trans.getNombre());
			break;
			
		case 4:
			System.out.println("Escriba el nombre del Transporte a buscar: ");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			trans = new Transporte(nombre);
			trans = (Transporte) imp.buscar(trans);
			System.out.println("Transporte encontrado->" + trans);
			break;
		case 5:
			imp.mostrar();
			break;
		case 6:
			System.out.println("Vuelva Pronto!!!! Bye");
			break;
			}
		}while(menu < 6);
	}//main
}//principal
