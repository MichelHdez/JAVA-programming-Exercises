import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	//Juagador
	String nombre;
	String app;
	int edad;
	String equipo;
	
	//Equipo
	String nombreEquipo;
	String trofeos;
	int anios;
	int clave = 0;
	
	Jugador jug = null;
	Equipo equ = null;
	int menu, opcion;
	Scanner lec = null;
	Implementacion imp = new Implementacion();
	
	do {
		//Menúen pantalla
		System.out.println("Bienvenido");
		System.out.println("1)Alta");
		System.out.println("2)Editar");
		System.out.println("3)Eliminar");
		System.out.println("4)Buscar");
		System.out.println("5)Busca por nombre");
		System.out.println("6)Contar");
		System.out.println("7)Mostrar");
		System.out.println("8)Salir");
		
		lec = new Scanner(System.in);
		menu = lec.nextInt();
		
		switch(menu) {
		case 1:
		System.out.println("Alta");	
		System.out.println("Escribe la clave: ");
		lec = new Scanner(System.in);
		clave = lec.nextInt();
		
		System.out.println("Escribe el Nombre: ");
		lec = new Scanner(System.in);
		nombre = lec.nextLine();
		
		System.out.println("Escribe el Apellido Paterno: ");
		lec = new Scanner(System.in);
		app = lec.nextLine();
		
		System.out.println("Ingresa la edad: ");
		lec = new Scanner(System.in);
		edad = lec.nextInt();
		
		System.out.println("Ingresa el equipo: ");
		lec = new Scanner(System.in);
		equipo = lec.nextLine();
	
		jug = new Jugador(clave, nombre, app, edad, equipo);
		imp.guardar(jug);
		 System.out.println("Se guardó el " +jug);
		break;
		
		case 2:
			System.out.println("Escribe la clave del jugador a editar: ");
			lec = new Scanner(System.in);
			clave = lec.nextInt();
			jug = new Jugador(clave);
			jug = (Jugador) imp.buscar(jug);
			do {
				System.out.println("Opcion a editar");
				System.out.println("1)Edad");
				System.out.println("2)Menu Principal");
				lec = new Scanner(System.in);
				opcion = lec.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Escribe la nueva edad a editar: ");
					lec = new Scanner(System.in);
					edad = lec.nextInt();
					jug.setEdad(edad);
	                System.out.println("Se actualizó la edad");
	                System.out.println(jug);
					break;
				}// switch
			} while (opcion < 2);
			imp.editar(jug);
			System.out.println(jug);
			break;
			
		case 3:
			System.out.println("Escribe la clave del jugador a eliminar: ");
			lec = new Scanner(System.in);
			clave = lec.nextInt();
			jug = new Jugador(clave);
			jug = (Jugador) imp.buscar(clave);
			imp.eliminar(jug);
			System.out.println("Se elimino el : " + jug);
			break;
			
		case 4:
			System.out.println("Escribe la clave del jugador a buscar: ");
			lec = new Scanner(System.in);
			clave = lec.nextInt();
			jug = new Jugador(clave);
			jug = (Jugador) imp.buscar(jug);
			System.out.println("Jugador encontrado->" + jug);
			break;
			
		case 5:
			System.out.println("Escriba el equipo a buscar: ");
			lec = new Scanner(System.in);
			equipo = lec.nextLine();
			jug = new Jugador();
			jug = (Jugador) imp.buscarPorEquipo(jug);
			System.out.println("Jugador encontrado->" + jug);
			break;
		case 6:
			imp.contar();
			break;
		case 7:
			imp.mostrar();
			break;
		case 8:
			System.out.println("Vuelve pronto");
			break;
			}			
		}while(menu < 8);
	}//main
}
