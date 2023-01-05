import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		int capitulos;
		int temporada;
		String genero;
		Scanner lec = null;
		int menu;
		Serie s = null;

		do {
			System.out.println("Bienvenido a series.Java");
			System.out.println("Menu");
			System.out.println("1)Alta");
			System.out.println("2)Mostrar");
			System.out.println("3)Editar->genero");
			System.out.println("4)Salir");
			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Alta de Series");
				System.out.println("Elige el nombre: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				System.out.println("Escribe los capitulos: ");
				lec = new Scanner(System.in);
				capitulos = lec.nextInt();
				System.out.println("Escribe las temporadas: ");
				lec = new Scanner(System.in);
				temporada = lec.nextInt();
				System.out.println("Escribe el numero de temporadas: ");
				lec = new Scanner(System.in);
				genero = lec.nextLine();

				s = new Serie();
				s.setNombre(nombre);
				s.setCapitulos(capitulos);
				s.setTemporada(temporada);
				s.setGenero(genero);
				System.out.println("Se dio de alta la serie" + s.getNombre());
				break;

			case 2:
				System.out.println("La serie tiene: ");
				System.out.println("Nombre->" + s.getNombre());
				System.out.println("Capitulos->" + s.getCapitulos());
				System.out.println("Temporadas->" + s.getTemporada());
				System.out.println("Genero->" + s.getGenero());
				break;

			case 3:
				System.out.println("Escribe el genero a editar");
				lec = new Scanner(System.in);
				genero = lec.nextLine();
				s.setGenero(genero);
				System.out.println("Se edito el genero");
				break;

			case 4:
				System.out.println("Vuelver pronto!!!");
				break;
			}// switch

		} while (menu < 4);

	}// main

}// clase principal
