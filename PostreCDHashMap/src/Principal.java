
public class Principal {

	public static void main(String[] args) {
		Postre pos1 = new Postre("Flan Napolitano", 25, 100);
		Postre pos2 = new Postre("Tartinas", 20, 400);
		Postre pos3 = new Postre("Helado de Chocolate", 70, 650);
		Postre pc = null;
		Implementacion imp = new Implementacion();

		// guardar
		imp.guardar(pos1);
		imp.guardar(pos2);
		imp.guardar(pos3);

		// mostrar
		imp.mostrar();
		
		//buscar
		pc = new Postre("Tartinas");
		System.out.println("Postre sin buscar " + pc);
		pc = imp.buscar(pc);
		System.out.println("Postre encontrado " + pc);
		
		//editar - antes de editar hay que buscar
		/*pc.setPrecio(105.5);
		imp.editar(pc);
		imp.mostrar();*/
		
		//Eliminar
		pc = new Postre("Helado de Chocolate");
		System.out.println("Eliminar postre");
		pc = imp.buscar(pc);
		imp.eliminar(pc);
		
		//Mostrar
		imp.mostrar();
	}// main
}// principal
