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
System.out.print ("Indique el % de inter�s ") ;
cadena = br.readLine();
dl = new Double(cadena);
interes = dl.doubleValue() ;
int a�os = 0;
do
{
a�os = a�os + 1;
capitalFinal = capitalFinal + capitalFinal*interes/100;
}
while (capitalFinal < 2 * capitalInicial) ;
System.out.println ("El n�mero de a�os que ha de "+
"estar invertido para poder "+
"duplicarse es "+a�os) ;
}
catch(Exception e)
{
}
}
}
