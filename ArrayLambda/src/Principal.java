import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		System.out.println("Mostrando todos los elementos de su array con expresi�n Lambda");
		
		//Mostrar
		arrayList.forEach(n-> System.out.println("\t" + n +""));
	}

}
