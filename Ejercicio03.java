class Ejercicio03{
  
public static void main(String args[]){
 int x = 1;
 int tope = 20;

 salida("valor x: " + x);
 salida("valor tope: " + tope);
 while(x < tope) {
     evaluar(x++);
 }
 System.exit(0);
    }

    public static void salida ( String cadena ) {
 System.out.println(cadena);
    }

    public static void evaluar ( int numero ) {
 switch(numero) {
 case 1: 
     salida("Uno");
     break;
 case 2: 
     salida("Dos");
     break;
 case 3: 
     salida("Tres");
     break;
 case 4: 
     salida("Cuatro");
     break;
 case 5: 
 case 6: 
     salida("Cinco o seis");
     break;
 default: 
     salida("Otro numero");
     break;
 }

    }

}