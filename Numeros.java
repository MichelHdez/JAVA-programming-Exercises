import java.util.Scanner;
public class Numeros{
public static void main(String[] a){
Scanner teclado = new Scanner(System.in);
int valor;
do{
System.out.println("Ingrese el valor");
valor=teclado.nextInt();
if (valor>=100){
System.out.println("El numero tiene 3 digitos");
}else{
	if(valor>=10){
	System.out.println("El numero tiene 2 digitos");
	}else{
	System.out.println("El numero tiene 1 digito");
		}
	}	
} while(valor!=0);
}
}

