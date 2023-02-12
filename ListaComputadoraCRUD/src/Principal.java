import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String modelo;
		String marca;
		double precio;
		Computadora compu = null;
		int menu = 0, opcion = 0, indice;

		Scanner lec = null;

		List<Computadora> lista = new ArrayList<Computadora>();
		
		do {
			System.out.println("Bienvenido a su tienda de computadoras");
        	System.out.println("*Menu de Opciones*");
            System.out.println("1)Alta");
            System.out.println("2)Editar"); //marca, precio o regresar a menú - do while
            System.out.println("3)Eliminar");
            System.out.println("4)Buscar");
            System.out.println("5)Contar");
            System.out.println("6)Vacia"); //isEmpty(); - valor booleano si empty es igual a true es vacia si no cuantos elementos hay
            System.out.println("7)Buscar por marca");
            System.out.println("8)Eliminar toda"); //clear();
            System.out.println("9)Mostrar");
            System.out.println("10)Salir");
            

            lec = new Scanner(System.in);
            menu = lec.nextInt();
            
            switch(menu) {
            case 1:
	            System.out.println("Alta de Computadoras");
	            
	        	System.out.println("Escribe el modelo");
	        	lec = new Scanner(System.in);
	        	modelo = lec.nextLine();
	        	
	        	System.out.println("Escribe la marca");
	        	lec = new Scanner(System.in);
	        	marca = lec.nextLine();
	        	
	        	System.out.println("Escribe el precio");
	        	lec = new Scanner(System.in);
	        	precio = lec.nextDouble();
	        	
	        	compu = new Computadora(modelo, marca, precio);
	        	lista.add(compu);
	        	System.out.println("Se guardó la computadora " +compu.getModelo());
            	break;
            	
            case 2:
            	//antes de editar hay que buscar el elemento
            	System.out.println("Eliga la opción a editar: ");
            	lec = new Scanner(System.in);
				indice = lec.nextInt();
				compu= lista.get(indice);
				do {
					System.out.println("1. Marca");
					System.out.println("2. Precio");
					System.out.println("3. Menú");
					lec = new Scanner(System.in);
					opcion = lec.nextInt();
					
					switch(opcion) {
					case 1:
						System.out.println("Escriba la marca a Editar: ");
						lec = new Scanner(System.in);
						marca = lec.nextLine();
						compu.setMarca(marca);
						break;
					case 2:
						System.out.println("Escriba el precio a editar: ");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						compu.setPrecio(precio);
						break;
					}
				}while(opcion < 3);
				lista.set(indice, compu);//se edite la lista
				System.out.println("Se editó la computadora " +compu);
            	break;
            	
            case 3:
            	System.out.println("Escriba el indice a eliminar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				compu = lista.get(indice);
				
				lista.remove(indice);
				System.out.println("Se eliminó la computadora" +compu);
            	break;
            	
            case 4:
            	System.out.println("Escriba el indice a buscar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				compu = lista.get(indice);
				System.out.println("La computadora encontrada es: " +compu);
            	break;
            	
            case 5:
            	System.out.println("La lista tiene " +lista.size() + " computadoras");
            	break;
            	
            case 6:
            	if(lista.isEmpty() == true) {
            		System.out.println("La lista está vacia");
            	} else {
            		System.out.println("La lista está no vacia, tiene " +lista.size() + " computadoras");
            	}
            	break;
            	
            case 7:
            	System.out.println("Escribe la marca a buscar");
            	lec = new Scanner(System.in);
            	marca = lec.nextLine();

				for (Computadora m : lista) {
					if (m.getMarca().equals(marca)) {
						System.out.println("La computadora encontrada es " + m);
					}
				}
            	break;
            	
            case 8:
            	lista.clear();
            	System.out.println("Se eliminaron todos los elementos de la lista");
            	break;
            	
            case 9:
            	System.out.println(lista);
            	break;
            	
            case 10:
            System.out.println("Regrese Pronto. Bye!!!!!");
            	break;
            }
		}while(menu < 10);
	}//main

}// fin clase principal
