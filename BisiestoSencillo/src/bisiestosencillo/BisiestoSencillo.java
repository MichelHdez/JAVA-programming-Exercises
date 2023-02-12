package bisiestosencillo;

import java.util.Scanner;

public class BisiestoSencillo {

    public static void main(String[] args) {
        int anio = 0;

        Scanner lec = new Scanner(System.in);
        System.out.println("Ingresa el año para determinar si es bisiesto o no");
        anio = lec.nextInt();

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

}
