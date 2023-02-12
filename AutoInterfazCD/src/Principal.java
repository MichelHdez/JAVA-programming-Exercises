import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String modelo;
		String marca;
		double precio;
		Auto a = null;
		int menu, opcion, indice;
		
		Scanner lec = null;
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("Menu");
			System.out.println("1)Alta");
			System.out.println("2)Editar");
			System.out.println("3)Eliminar");
			System.out.println("4)Buscar");
			System.out.println("5)Contar");
			System.out.println("6)Vacia");
			System.out.println("7)Buscar por marca");
			System.out.println("8)Eliminar Todos");
			System.out.println("9)Mostrar");
			System.out.println("10)Salir");
			
			lec= new Scanner(System.in);
			menu = lec.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Alta de Auto");
            	System.out.println("Escribe el modelo");
            	lec = new Scanner(System.in);
            	modelo = lec.nextLine();
            	
            	System.out.println("Escribe la marca");
            	lec = new Scanner(System.in);
            	marca = lec.nextLine();
            	
            	System.out.println("Ingresa el precio");
            	lec = new Scanner(System.in);
            	precio = lec.nextDouble();
            	
            	
            	a = new Auto(modelo,marca,precio);
            	imp.guardar(a);
            	System.out.println("Se guardó el auto: " +a);
				break;
				
			case 2:
				//antes de editar hay que buscar el elemento
				System.out.println("Escriba el auto a editar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				a = imp.buscar(indice);
				do {
					System.out.println("1) Marca");
					System.out.println("2) Precio");
					System.out.println("3) Menú Principal");
					lec = new Scanner(System.in);
					opcion = lec.nextInt();
					
					switch(opcion) {
					case 1:
						System.out.println("Escriba la marca a Editar: ");
						lec = new Scanner(System.in);
						marca = lec.nextLine();
						a.setMarca(marca);
						break;
						
					case 2:
						System.out.println("Escriba el precio a editar: ");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						break;
					}//
				}while(opcion < 3);
				imp.editar(indice, a);
				System.out.println("Se editó el auto " +a);
				break;
				
			case 3:
				System.out.println("Escriba el indice a eliminar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				a = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Se eliminó el auto: " +a);
				break;
				
			case 4:
				System.out.println("Escriba el indice a buscar: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				a= imp.buscar(indice);
				System.out.println("El auto encontrado es: " +a);
				break;
				
			case 5:
				imp.contar();
				break;
				
			case 6:
				imp.vacia();
				break;
				
			case 7:
				System.out.println("Escribe la marca a buscar");
            	lec = new Scanner(System.in);
            	marca = lec.nextLine();
            	a = new Auto(marca);
            	imp.buscarMarca(a);
				break;
			case 8:
				imp.eliminarTodo();
				break;
				
			case 9:
				imp.mostrar();
				break;
				
			case 10:
				System.out.println("Adios!!!!!!!");
				break;
				
			}//switch
			
		}while(menu < 10);
		
	}//main

}//principal
