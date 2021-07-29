class Cal{

public static void main(String[] args ){
        int numero;
        scanner teclado = new scanner( System.in );
        
        System.out.print( "Introduce un número del 1 al 10: " );
        numero = teclado.nextInt();
        
        switch( numero ) {
            case 1: System.out.println( "Uno" );
            case 2: System.out.println( "Dos" );
            case 3: System.out.println( "Tres" );
            case 4: System.out.println( "Cuatro" );
            case 5: System.out.println( "Cinco" );
            case 6: System.out.println( "Seis" );
            case 7: System.out.println( "Siete" );
            case 8: System.out.println( "Ocho" );
            case 9: System.out.println( "Nueve" );
            case 10: System.out.println( "Diez" );
            default:
                System.out.println( "El número no está en el rango de 1-10" );
        } 
    }   
}  
