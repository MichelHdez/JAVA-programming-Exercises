import java.io.*;

class SumaDatosTeclado{
	public static void main(String args[])throws IOException{
	InputStreamReader en = new InputStreamReader(System.in);
	BufferedReader entrada = new BufferedReader(en);
	int num1,num2;

	System.out.print("Teclea el primer numero");
	num1 = Integer.parseInt(entrada.readLine());
	System.out.flush();
	System.out.print("Teclea el segundo numero");
	
	num2 = Integer.parseInt(entrada.readLine());

	if (num1>=num2);
		System.out.println("+num1+" es mayor a "+num2);
	else
		System.out.println("+num2+" es mayor a "+num1);
    	}
}