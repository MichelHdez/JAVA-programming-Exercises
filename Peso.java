import java.util.Scanner;
public class Peso {
public static void main(String[] ar) {
Scanner teclado=new Scanner(System.in);
int cant1,cant2,cant3,suma;
float peso;
cant1=0;
cant2=0;
cant3=0;
do {
System.out.print("Ingrese el peso de la pieza (0 para finalizar):");
peso=teclado.nextFloat();
if (peso>10.2) {
cant1++;
} else {
if (peso>9.8&&peso<10.2) {
cant2++;
} else {
if (peso>0) {
cant3++;
}
}
}
} while(peso!=0);
suma=cant1+cant2+cant3;
System.out.print("Piezas con un peso entre:");
System.out.println(cant2);
System.out.print("Piezas con un peso superior a 10.2:");
System.out.println(cant1);
System.out.print("Piezas con un peso inferior a 9.8:");
System.out.println(cant3);
}
}