
public class Principal {

	public static void main(String[] args) {
		Instrumento i = new Instrumento("Tipos de Instrumento");
		i.Tocar();
		
		i = new Saxofon("Saxofon", "viento");
		i.Tocar();
		
		i= new Violin("Violin", "cuerdas");
		i.Tocar();
	}

}
