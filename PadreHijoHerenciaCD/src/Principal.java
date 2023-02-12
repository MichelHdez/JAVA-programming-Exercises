
public class Principal {

	public static void main(String[] args) {
		Hija h = new Hija("Gohan", "Son", "Kakaroto", 15, "estudiar", "prepa", 1.5);
		System.out.println(h);
		
		//setear de la clase Padre
		h.setEdad(25);
		
		//setear de la clase Hija
		h.setEstatura(1.8);
		System.out.println(h);
		
		//Méodo que está en la clase Padre
		h.trabajar("Templo Sagrado");
		
		//Método que está en la clase hija
		h.estudiar();
	}

}
