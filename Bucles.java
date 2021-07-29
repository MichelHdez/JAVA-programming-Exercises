import java.io.*;
class Bucles
{
	public static void main(String args[]){
	System.out.println("\n\t i \t j"); //cabecera
	for (int i=0;i<4; i++){

		System.out.println("Externo\t " + i);
		for (int j=0;j<i;j++)
			System.out.println("Interno\t\t " + j);
		}
	}
}