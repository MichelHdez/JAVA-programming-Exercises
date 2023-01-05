package PerroEncapsulamiento;

public class Principal {

	public static void main(String[] args) {
		Perro perro = new Perro();
		//Seteamos los valores
		perro.setNombre("Duque");
		perro.setEdad(5);
		perro.setGenero("Macho");
		perro.setColor("Blanco");
		
		System.out.println("El perro tiene: ");
		System.out.println("Nombre-->" +perro.getNombre());
		System.out.println("Edad-->" +perro.getEdad());
		System.out.println("Género-->" +perro.getGenero());
		System.out.println("Color-->"+ perro.getColor());
		
	}//main

}//clase principal
