import java.io.*;
class Ejercicio15{
	public static void main(String []a)throws IOException {
	BufferedReader x;
	x =new BufferedReader (new InputStreamReader (System.in));
	int calificacion =0;
	double Muydeficiente =0;
	double Insuficiente =0;
	double Suficiente =0;
	double Bien =0;
	double Notable =0;
	double Sobresaliente =0;

	System.out.println("Ingrese la calificacion");
	calificacion = Integer.parseInt(x.readLine());

	if((0<=3)){
	System.out.println("La calificacion es Muydeficiente");
	}
	else
		if((3<=5)){
		System.out.println("La calificacion es Insuficiente");
		}
		else
			if((5<=6)){
			System.out.println("La calificacion es Suficiente");
			}
			else
				if((6<=7)){
				System.out.println("La calificacion corresponde a Bien");
				}
				else
					if((7<=9)){
					System.out.println("La calificacion es Notable");
					}
					else
						if((9<=10)){
						System.out.println("La calificacion es Sobresaliente");
						}
	}
}
				
					
			