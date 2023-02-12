
public class Principal {

	public static void main(String[] args) {
		// instanciar-->crear un espacio de memoria
		Mascota m1 = new Mascota("Scooby", "perro", 5);
		Mascota m2 = new Mascota("Dino", "Dinosaurio", 60);
		Mascota m3 = new Mascota("Benito", "Gato", 1);

		Mascota mc = null;

		Implementacion imp = new Implementacion();
		// guardar
		imp.guardar(m1);
		imp.guardar(m2);
		imp.guardar(m3);

		// mostrar
		imp.mostrar();

		// Buscar
		mc = new Mascota("Scooby");
		mc = (Mascota) imp.buscar(mc);
		System.out.println("Mascota encontrada " + mc);
		
		//editar
		mc = (Mascota) imp.buscar(new Mascota("Benito"));
		mc.setEdad(2);
		imp.editar(mc);
		imp.mostrar();
		
		//eliminar
		imp.eliminar(new Mascota("Scooby"));
		imp.mostrar();
		
		//contador
		imp.contar();
	}//main
}//principal
