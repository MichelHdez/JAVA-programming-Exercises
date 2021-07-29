import java.io.*;
class Ejercicio17{
	public static void main(String []a)throws IOException{
	BufferedReader x;
	x = new BufferedReader (new InputStreamReader (System.in));
	int N =0, j=1;



	System.out.println("Ingrese numero");
	N = Integer.parseInt(x.readLine());
	if(N%1==1){
	System.out.println("El numero "+N+" es primo");
	}
	else
		if(N%2==0){
		System.out.println("El numero "+N+" no es primo");
		}
}
}
