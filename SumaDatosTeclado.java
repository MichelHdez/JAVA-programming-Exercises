import java.io.*;

public class SumaDatosTeclado{
	public static void main(String args[])throws IOException{

	InputStreamReader isr=new InputStreamReader(System.in);

	BufferedReader br=new BufferedReader (isr);
	System.out.print("Teclea el primer numero: ");

	String texto1=br.readLine();

	int num1=Integer.parseInt(texto1);

	System.out.print("Teclea el segundo numero: ");
	String texto2=br.readLine();
	int num2=Integer.parseInt(texto2);

	System.out.println("suma de "+num1+" y "+num2+" es "+(num1+num2));
    	}
}