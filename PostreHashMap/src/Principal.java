
public class Principal {

	public static void main(String[] args) {

		Postre pos1 = new Postre("Flan Napoitano", 25, 100);
		Postre pos2 = new Postre("Pastel", 25, 90);
		Postre pos3 = new Postre("Gelatina", 20, 10);
		Postre pc = null;
		Implementacion imp = new Implementacion();

		// guardar
		imp.guardar(pos1);
		imp.guardar(pos2);
		imp.guardar(pos3);
		// mostrar
		imp.mostrar();
		// buscar
		pc = new Postre("Pastel");
		System.out.println("Postre sin buscar->" + pc);
		pc = imp.buscar(pc);
		System.out.println("Postre encontrado->" + pc);

		// editar
		pc.setPrecio(105.5);
		imp.editar(pc);
		imp.mostrar();
		// eliminar
		pc = new Postre("Gelatina");
		imp.eliminar(pc);
		imp.mostrar();

	}// fin main

}// fin clase principal
