import java.util.Scanner;
public class Par{
	public static void main(String[] args){
	Scanner leer=new Scanner(System.in);
	int tam;
	System.out.println("Indica el tamaño del arreglo");
	tam=leer.nextInt();
	int array[]=new int[tam];
	Par(array,0,tam,2);
}

	public static void Par(int array[],int cont,int y,int valor){
	int i=cont,v=valor;
	array[i]=v;
	System.out.println(array[i]+" ");
	if(i==y-1){
	return;
	}else{
	i++;
	v+=2;	
	Par(array,i,y,v); 
		}
	}
}