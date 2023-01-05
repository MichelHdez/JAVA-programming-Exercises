
public class Principal {

	public static void main(String[] args) {
		System.out.println("Variable final");
		FinalStatic sf1 = new FinalStatic();
		System.out.println(sf1.b);
		System.out.println("Variable estática o static");
		
		FinalStatic sf2 = new FinalStatic();
		sf2.a=0;
		System.out.println(sf2.a);
		sf2.a=10;
		System.out.println(sf2.a);
		
		FinalStatic sf3 = new FinalStatic();
		System.out.println(sf3.a);
		
		FinalStatic sf4 = new FinalStatic();
		System.out.println(sf4.a);
		sf4.a =20;
		System.out.println(sf4.a);
	}

}
