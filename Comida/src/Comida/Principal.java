package Comida;

public class Principal {

	public static void main(String[] args) {
		Comida comida = new Comida();
		
		//Seteamos los valores
		comida.setNombre("Enchiladas");
		comida.setPorcion(5);
		comida.setPrecio(100);
		comida.setRegion("Suizas");
		
		System.out.println("La comida tiene las siguientes características: ");
		System.out.println("Nombre-->" +comida.getNombre());
		System.out.println("Porcion-->" + comida.getPorcion());
		System.out.println("Precio-->" +comida.getPrecio());
		System.out.println("Región-->" +comida.getRegion());
	}//clase

}//principal
