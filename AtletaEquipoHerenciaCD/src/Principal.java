
public class Principal {

	public static void main(String[] args) {
		Equipo e = new Equipo("Cosme", "Fulanito", 2.2, "Mexico", "Defensa", "Europeo");
		System.out.println(e);
		
		//setear nombre
		e.setNombre("Homero");
		
		//setear de la clase Padre
		e.setContinente("Americano");
		
		//
		e.setEstatura(2.5);
		
		//setear de la clase Hija
		e.setEspecialidad("Delantero");
		
		//M�odo que est� en la clase Padre
		e.entrenar("Brasil");
		
		//M�todo que est� en la clase hija
		e.competir();
		
		System.out.println(e);
	}

}
