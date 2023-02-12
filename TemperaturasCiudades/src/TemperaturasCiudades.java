import java.util.Scanner;

public class TemperaturasCiudades {

	public static void main(String[] args) {
		//Creamos los vectores
		String ciudades[] = new String[5];
		Double minimas[] = new Double[5];
		Double maximas[] = new Double[5];
		
		//Entrada teclado
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		//Cargar los vectores
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Ingresa el nombre de las ciudades: " + i);
			ciudades[i] = teclado.next();
			
			System.out.println("Ingresa la temperatura minima : " + i);
			minimas[i] = teclado2.nextDouble();
			
			System.out.println("Ingresa la temperatura máximas : " + i);
			maximas[i] = teclado2.nextDouble();
		}
		
		Double minima = 999.00;
		int posMin = -1;
		//determinar la minima
		for (int i = 0; i < ciudades.length; i++) {
			if (minimas[i] < minima) {
				minima = minimas[i];
				posMin = i;
			}
			
		}
		
		Double maxima = 999.00;
		int posMax = -1;
		//determinar la minima
		for (int i = 0; i < ciudades.length; i++) {
			if (maximas[i] > maxima) {
				maxima = maximas[i];
				posMax = i;
			}
		}
		
		System.out.println("La temperatura minima es de : " + minima);
		System.out.println("Se registró en la ciudad de: " +ciudades[posMin]);
		System.out.println("La temperatura máxima es de : " + maxima);
		System.out.println("Se registró en la ciudad de: " +ciudades[posMax]);
	}

}
