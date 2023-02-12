import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
        String director;
        double duracion;
        String genero;
        Pelicula peli = null;
        int menu;
        Scanner lec = null;

        do {
        	System.out.println("Bienvenido al cat�logo de Pel�culas");
        	System.out.println("*Menu de Opciones*");
            System.out.println("1)Alta");
            System.out.println("2)Editar G�nero");
            System.out.println("3)Mostrar");
            System.out.println("4)Salir");
            lec = new Scanner(System.in);
            menu = lec.nextInt();
            
            switch(menu) {
            case 1:
            	System.out.println("Alta de Pelicula");
                System.out.println("Escribe la pel�cula");
                lec = new Scanner(System.in);
                nombre = lec.nextLine();
                System.out.println("Escribe el director");
                lec = new Scanner(System.in);
                director = lec.nextLine();   
                System.out.println("Escribe la duraci�n");
                lec = new Scanner(System.in);
                duracion = lec.nextDouble(); 
                System.out.println("Escribe el genero");
                lec = new Scanner(System.in);
                genero = lec.nextLine();
                peli = new Pelicula(nombre, director, duracion, genero);
                System.out.println("Se dio de alta la pel�cula " + peli.getNombre());
            	break;
            	
            case 2:
            	System.out.println("Edite el g�nero de la pel�cula");
            	lec = new Scanner(System.in);
                genero = lec.nextLine();
                peli.setGenero(genero);
                System.out.println("Se edit� el g�nero");
                System.out.println(peli);
            	break;
            case 3:
            	System.out.println(peli);
            	break;
            	
            case 4:
            	System.out.println("Regrese pronto. Bye!!!!");
            	break;
            }
        }while(menu<4);
        
	}

}
