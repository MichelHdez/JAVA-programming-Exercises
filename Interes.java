import java.io.*;
public class Interes
{
public static void main (String[] args){
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String cadena;
double capitalInicial = 0;
double capitalFinal = 0;
double interes=0;
try
{
System.out.print ("Indique el capitalInicial ") ;
cadena = br.readLine () ;
Double dl = new Double(cadena);
capitalInicial = dl.doubleValue();
capitalFinal = capitalInicial;
System.out.print ("Indique el % de interés ") ;
cadena = br.readLine();
dl = new Double(cadena);
interes = dl.doubleValue() ;
int años = 0;
do
{
años = años + 1;
capitalFinal = capitalFinal + capitalFinal*interes/100;
}
while (capitalFinal < 2 * capitalInicial) ;
System.out.println ("El número de años que ha de "+
"estar invertido para poder "+
"duplicarse es "+años) ;
}
catch(Exception e)
{
}
}
}
