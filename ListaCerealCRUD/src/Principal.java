import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		String marca;
		double precio;
		int contenido;
		
		Cereal cereal = null;
		Scanner lec = null;
		int menu, indice;
		
		//CRUD con ArrayList
		List<Cereal> lista = new ArrayList<Cereal>();

		do {
			System.out.println("Bienvenido al buffete de Cereales");
        	System.out.println("*Menu de Opciones*");
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
            	System.out.println("Alta de Cereales");
            	System.out.println("Escribe el nombre");
            	lec = new Scanner(System.in);
            	nombre = lec.nextLine();
            	
            	System.out.println("Escribe la marca");
            	lec = new Scanner(System.in);
            	marca = lec.nextLine();
            	
            	System.out.println("Ingresa el precio");
            	lec = new Scanner(System.in);
            	precio = lec.nextDouble();
            	
            	System.out.println("Ingresa el contenido");
            	lec = new Scanner(System.in);
            	contenido = lec.nextInt();
            	
            	cereal = new Cereal(nombre,marca,precio,contenido);
            	lista.add(cereal);
            	System.out.println("Se guardó el cereal " +cereal.getNombre());
            	break;
            	
            case 2:
            	//antes de editar hay que buscar el elemento
				System.out.println("Escriba el indice a editar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal = lista.get(indice);
				
				System.out.println("Escribe el nuevo contenido a modificar");
				lec = new Scanner(System.in);
				contenido = lec.nextInt();
				cereal.setContenido(contenido);
				lista.set(indice, cereal);
				System.out.println("Se editó el contenido del cereal: " +cereal);
            	break;
            case 3:
            	System.out.println("Escriba el indice a eliminar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal =lista.get(indice);
				lista.remove(indice);
				System.out.println("Se eliminó");
            	break;
            case 4:
            	System.out.println("Escriba el indice a buscar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				cereal = lista.get(indice);
				System.out.println("El cereal encontrado es: " +cereal);
            	break;
            	
            case 5:
            	System.out.println(lista);
            	break;
            	
            case 6:
            	System.out.println("Vuelve pronto");
            	break;
            }
		}while(menu < 6);
		
	}//fin del main

}//fin de principal
