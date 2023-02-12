import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Perro> lista = new ArrayList<Perro>();
		Perro perroc = new Perro("Scooby","danes",5);
		
		//iniciamos con el índice 0
		lista.add(perroc);
		//indice 1
		perroc = new Perro("Dolar","dalmata",4);
		lista.add(perroc);
		//indice2
		perroc = new Perro("Milo","ratonero",2);
		lista.add(perroc);
		
		//Mostrar
		System.out.println(lista);
		
		//Buscar
		perroc = lista.get(2);
		System.out.println("Perro encontrado " +perroc);
		
		//Editar-> Antes de editar hay que buscar el elemento
		perroc = lista.get(1);
		perroc.setEdad(6);
		lista.set(1, perroc);
		System.out.println("Lista Editada--> \n" +lista);
		
		//Elimnar un elemento
		perroc = lista.get(0);
		lista.remove(0);
		System.out.println("El elemento eliminado es--> " +perroc);
		System.out.println(lista);
		
	}//main

}//clase principal
