import java.util.Scanner;
class Prom{
public static void main (String[] args ){
	 Scanner teclado=new Scanner(System.in);
        int edad=0,f,valor,promedio;
	edad=0;
        for(f=1;f<=50;f++){
		System.out.print("Ingrese valor:");
		valor=teclado.nextInt();
            	edad=edad+valor;
        }	
		promedio=edad/50;
		System.out.println("El promedio de edad de la seccion 301 es: "+promedio);
           
    }
}
