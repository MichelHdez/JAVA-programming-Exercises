
public class FinalStatic {
	public static int a=10;
	public final int b=100; //constante
	
	//el metodo final no se puede heredar, ya que no se modifique o se sobreescriba
	public FinalStatic() {
		a++;
		//b=20; marca error al ser una constante o variable final
		
	}
	
}
