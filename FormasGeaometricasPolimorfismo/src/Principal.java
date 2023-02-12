
public class Principal {

	public static void main(String[] args) {
		Forma f = new Forma("Forma");
		f.MostrarNombre();
		
		f = new Circulo("Circulo 1","Grande");
		f.MostrarNombre();
		
		f = new Cuadrado("Cuadrado","Chico");
		f.MostrarNombre();

	}

}
