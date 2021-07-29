import java.util.Scanner;

class Ejercicio2_5{
public static void main(String[]args){
	scanner scan =new scanner ();
	arreglo arr=new arreglo();
	System.out.print("Introduce cuantos numeros quieres almacenar en el arreglo ");
	int tam=scan.entero();
	int A[]=arr.crea(tam);
A=arr.llena(A,0);
System.out.println("la suma del arreglo es= "+arr.sumaArreglo(A,0,0));
	}
}

class arreglo{
public int [] crea(int tam){
	int A[]=new int [tam];
	for (int x=0; x<tam; x++)
	A[x]=0;
	return A;
}
public int [] llena (int A[], int x){
	scanner scan=new scanner();
	int tam=A.length;
	if(x<tam){
		System.out.print("ingresa el numero = ");
		A[x]=scan.entero();
		return llena (A,x+1);
}
return A;
}
public int sumaArreglo(int A[], int suma, int x)
{
	int tam= A.length;
	if(x<tam)
	return sumaArreglo(A,suma=suma+A[x],x=x+1);
return suma;
}

public void imprime(int A[]){
	int tam= A.length;
	for(int x=0;x<tam; x++)
		System.out.println(A[x]);
	}
}
class scanner{
	public int entero(){
	Scanner s=new Scanner (System.in);
	int x=0;
	try{
		x=s.nextInt();
	}catch(Exception e){
	System.out.println(e);
	}
	return x;
	}
}

