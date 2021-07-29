import java.io.*;
class Ejercicio16{
public static void main(String []a)throws IOException{
	BufferedReader x;
	x = new BufferedReader (new InputStreamReader (System.in));
	int N =0;

	System.out.println("Ingrese numero");
	N = Integer.parseInt(x.readLine());
	if(N%2==0){
	System.out.println(" El numero "+N+" es par");
	}
	else	
		System.out.println(" El numero "+N+" es impar");
		}
}