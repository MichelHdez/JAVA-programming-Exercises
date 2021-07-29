import java.io.*;
class Persona{
	public static void main(String args[]) throws IOException{
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	String Nombre[];
	int n;
	Nombre = new String[4];
	Nombre[0]= "Iveth";
	Nombre[1]= "Luis";
	Nombre[2]= "Chascar";
	Nombre[3]= "Michel";


	System.out.println ("Ingrese nombres");
	n = Integer.parseInt(in.readLine());
	String nombre[] = new String[n];
	System.out.println("Los nombres son : "+Nombre[3]);
	}
}