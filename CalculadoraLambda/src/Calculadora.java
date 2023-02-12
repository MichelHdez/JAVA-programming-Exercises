import java.util.Arrays;

public class Calculadora {

	public interface Calc {
		int suma(int a, int b);
	}


	public static void main(String[] args) {
		Calc calc = (a, b) -> {
			return a + b;
		};
		System.out.println("Total de suma: " + calc.suma(1, 3));
			
		/*Calc calc1 = (a, b) -> {
			return a - b;
		};
		System.out.println("Total de resta: " + calc1.resta(20, 10));
		
		Calc calc2 = (a, b) -> {
			return a * b;
		};
		System.out.println("Total de multiplicación: " + calc2.multiplicacion(8, 8));
		
		Calc calc3 = (a, b) -> {
			return a / b;
		};
		System.out.println("Total de división: " + calc3.division(50, 3));*/
		
		
		//Suma con metodo stream y promedio
		int[] numeros = {7,13,2,5,29,23,17,3,31,11};
		int suma = Arrays.stream(numeros).sum();
		int total=0;
		for (int i = 0; i < numeros.length; i++) {
			total += numeros[i];
		}
		System.out.println("Total de suma: " + suma);
		System.out.println("El promedio es de: " + suma/numeros.length);
		
	}
}
