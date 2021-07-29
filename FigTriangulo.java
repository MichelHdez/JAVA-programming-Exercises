import java.util.Scanner;
class Triangulo
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        int n;
        int i;
do {
            System.out.print ("Ingrese el tamanio de la base (impar) ");
            n = teclado.nextInt();
        } while (n % 2 == 0 || n < 4);

        int medio = n / 2;
        int xi = medio - 1, xd = medio + 1;
        int f = n / 3;

        System.out.print ("\n");

        for (i = 0; i < n; i++)
            if (i == medio)
                System.out.print ("*");
            else
                System.out.print (" ");
 System.out.print ("\n");

        for (i = 0; i < f; i++) {
            for (int j = 0; j < n; j++)
                if (j == xi || j == xd)
                    System.out.print ("*");
                else
                    System.out.print (" ");
            System.out.print ("\n");
            xi--;
            xd++;
        }

        for (i = 0; i < n; i++)
            if (i >= xi && i <= xd)
                System.out.print ("*");
            else
                System.out.print (" ");
    }
}