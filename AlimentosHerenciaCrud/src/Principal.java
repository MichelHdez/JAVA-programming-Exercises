
public class Principal {

	public static void main(String[] args) {
		Alimentos a = new Alimentos("chilaquiles", 100, 45);
		Alimentos a2 = new Alimentos("Hot Cakes", 250, 25);
		Alimentos a3 = new Alimentos("Flautas", 80, 40);
		Alimentos ac = null;

		ImpAlimentos impA = new ImpAlimentos();

		// Guardar
		impA.guardar(a.getNombre(), a);
		impA.guardar(a2.getNombre(), a2);
		impA.guardar(a3.getNombre(), a3);

		// Mostrar
		impA.mostrar();
		
		//Buscar
		ac =(Alimentos) impA.buscar(a2.getNombre());
		System.out.println("Alimento encontrado--> " +ac);
		
		//Editar
		ac.setPrecio(100);
		impA.editar(ac.getNombre(), ac);
		impA.mostrar();
		
		//Eliminar
		impA.eliminarr(a3.getNombre());
		impA.mostrar();

	}// main
}// principal
