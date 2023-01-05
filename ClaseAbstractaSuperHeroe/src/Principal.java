
public class Principal {

	public static void main(String[] args) {
		Batman b = new Batman("Bruce", "Wayne", "Batman", "Inteligencia", "Ciudad Gotica", "Negro");
		System.out.println(b);

		// metodo no abstracto 
		b.salvar(15);

		// metodo abstracto
		b.trabajar();

		// metodo propio de la clase
		b.investigar();

		System.out.println("\n");
		
		SpiderMan s = new SpiderMan("Peter","Parker","SpiderMan","Agilidad","Nueva York","SentidoAracnido",22);
		System.out.println(s);
		// metodo no abstracto 
		s.salvar(50);

		// metodo abstracto
		s.trabajar();

		// metodo propio de la clase
		s.entrenar();
		
	}

}
