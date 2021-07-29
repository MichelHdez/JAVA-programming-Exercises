import java.util.*;
 class Ejercicio2_2{
      public static void reves(int n){
        System.out.print(n % 10);
        if( n/10!=0 )
            reves(n/10);
      }
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
          System.out.print("Ingrese numero : ");
          num=sc.nextInt();
        }while(num<=0);
        System.out.print("Numero al reves : ");
        reves(num);
        System.out.println();
      }
}