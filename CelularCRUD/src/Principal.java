import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class Principal {

	public static void main(String[] args) {
		String modelo, marca;
		double precio;
		int ram;
		Celular cel = null;
		int menu;
		Scanner lec = null;
		
		do {
			System.out.println("Bienvenido a Tachiditos Phone");
			System.out.println("*Menú de Opciones*");
			System.out.println("1)Alta");
	        System.out.println("2)Editar");
	        System.out.println("3)Mostrar");
	        System.out.println("4)Salir");
	        
	        lec = new Scanner(System.in);
	        menu = lec.nextInt();
	        
	        switch(menu) {
	        case 1:
	        	System.out.println("Alta Celular");
                System.out.println("Escribe el modelo");
                lec = new Scanner(System.in);
                modelo = lec.nextLine();
                System.out.println("Escribe la marca");
                lec = new Scanner(System.in);
                marca = lec.nextLine();
                System.out.println("Escribe el precio");
                lec = new Scanner(System.in);
                precio = lec.nextDouble();
                System.out.println("Escribe la ram");
                lec = new Scanner(System.in);
                ram = lec.nextInt();
                cel = new Celular(modelo,marca,precio,ram);
                System.out.println("Se ingresó el celular " +cel.getModelo());
	        	break;
	        	
	        case 2:
	        	System.out.println("Escriba el nuevo precio");
                lec = new Scanner(System.in);
                precio = lec.nextDouble();
                cel.setPrecio(precio);
                System.out.println("Se actualizó el precio");
                System.out.println(cel);
	        	break;
	        	
	        case 3:
	        	System.out.println(cel);
	        	break;
	        	
	        case 4:
	        	System.out.println("Vuelva Pronto. Bye!!!!!");
	        	break;
	        }	        
		}while(menu<4);
	}//main

}//clase principal
