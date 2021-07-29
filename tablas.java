import java.io.*;
class tablas{
public static void main(String[] args)throws IOException { 
int i;
         System.out.println("ingrese un numero  ");
   	 BufferedReader recibir=new BufferedReader(new InputStreamReader (System.in));
	 String nombre=recibir.readLine();
	 i=Integer.parseInt(nombre);
	 for(int j=1; j<=10; j++){

	System.out.println("El resultado  :"+i+"x"+j+"="+i*j);
	}
     }
}