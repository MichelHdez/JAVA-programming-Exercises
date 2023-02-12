import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Zapato> lista =  new ArrayList<Zapato>();
		Zapato zapatol = new Zapato("Sport","urbano","azul",250);
		
		//iniciamos con el índice 0
		lista.add(zapatol);
		//indice 1
		zapatol = new Zapato("Montaña","deportivo","cafe",500);
		lista.add(zapatol);
		//indice2
		zapatol = new Zapato("Black","formal","negro",350);
		lista.add(zapatol);
		
		//Mostrar
		System.out.println(lista);
		
		//Buscar
		zapatol = lista.get(2);
		System.out.println("Calzado encontrado " +zapatol);
		
		//Editar-> Antes de editar hay que buscar el elemento
		zapatol = lista.get(1);
		zapatol.setPrecio(1500);
		lista.set(1, zapatol);
		System.out.println("Lista Editada--> \n" +lista);
		
		//Elimnar un elemento
		zapatol = lista.get(0);
		lista.remove(0);
		System.out.println("El elemento eliminado es--> " +zapatol);
		System.out.println(lista);
	}//finmain
}//principal
