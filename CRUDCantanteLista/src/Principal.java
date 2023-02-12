import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		String app;
		String nomArt;
		int edad;
		String genero;
		
		Cantante can = null;
		Scanner lec = null;
		int menu, indice;
		
		List<Cantante> lista = new ArrayList<Cantante>();
		
		do {
			//Menúen pantalla
			System.out.println("Bienvenido a disquera Enucom");
			System.out.println("1)Alta");
			System.out.println("2)Editar género musical");
			System.out.println("3)Eliminar");
			System.out.println("4)Buscar");
			System.out.println("5)Busca por nombre");
			System.out.println("6)Mostrar");
			System.out.println("7)Salir");
			
			lec = new Scanner(System.in);
			
			menu = lec.nextInt();//se guarda en Int porque se elige un numero del menu
			
			switch(menu) {
			case 1:
			System.out.println("Alta de Cantante");	
			System.out.println("Escribe el Nombre:  ");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			
			System.out.println("Escribe el Apellido Paterno:  ");
			lec = new Scanner(System.in);
			app = lec.nextLine();
			
			System.out.println("Escribe el Nombre Artístico:  ");
			lec = new Scanner(System.in);
			nomArt = lec.nextLine();
			
			System.out.println("Ingresa la edad:  ");
			lec = new Scanner(System.in);
			edad = lec.nextInt();
			
			System.out.println("Escribe el genero:  ");
			lec = new Scanner(System.in);
			genero = lec.nextLine();
			
			can = new Cantante(nombre,app,nomArt,edad,genero);
			lista.add(can);
			 System.out.println("Se guardó el Cantante" +can.getNomArt());
			break;
			
			case 2:
				//antes de editar hay que buscar el elemento
				System.out.println("Escriba el indice a editar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				can = lista.get(indice);
				
				System.out.println("Escriba el nuevo género musical");
				lec = new Scanner(System.in);
				genero = lec.nextLine();
				can.setGenero(genero);
				lista.set(indice, can);
				System.out.println("Se editó el género musical: " +can);
				break;
				
			case 3:
				System.out.println("Escriba el indice a buscar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				can = lista.get(indice);
				lista.remove(indice);
				System.out.println("Se elimino: ");
				break;
				
			case 4:
				System.out.println("Escriba el indice a buscar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				can = lista.get(indice);
				System.out.println("El cantante encontrado es: " +can);
				break;
				
			case 5:
				System.out.println("Escriba el nombre a buscar: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				for(Cantante m: lista) {
					if(m.getNombre().equals(nombre)){
						System.out.println("El cantante es : " +m);
					}//if
				}//cierra for
				break;
				
			case 6:
				System.out.println(lista);
				break;
				
			case 7:
				System.out.println("Vuelve pronto");
				break;
			}//cierra switch			
			
		}while(menu < 7);

	}//main

}//principal
