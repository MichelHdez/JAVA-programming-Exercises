import java.io.*;
class Costo
{
	 public static void main(String[] args) throws IOException {
	BufferedReader x=new BufferedReader (new InputStreamReader (System.in));
		String cant;
		int Cantidad;
	//String blusaCant, faldaCant, pantalonCant, playeraCant, camisaCant, sacoCant, cinturonCant, bolsaCant, carteraCant, tennisCant;
		double blusa=150.00, falda=50.00, pantalon=100.00, playera=220.00, camisa=120.00, saco=300.00, cinturon=50.00, bolsa=150.00, cartera=200.00, tennis=450.00;
		double total, descuento, monto;
		System.out.println("***\n ---------- Lista de Artículos y Precios ----------\n ");
		System.out.println("\n*** Producto...............Precio M/N ***\n    Blusa ----------150.00\n    Falda ----------50.00\n    Pantalón ----------100.00\n    Playera ----------220.00");
		System.out.println("    Camisa ----------120.00\n    Saco ----------300.00\n    Cinturón ----------50.00\n    Bolsa ----------150.00\n    Cartera ----------200.00\n    Tennis ----------450.00");
		System.out.println("\n\n Ingrese la cantidad vendida según el producto\nBlusa:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		blusa=blusa*Cantidad;
	
		System.out.println("\nFalda:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		falda=falda*Cantidad;
		
		System.out.println("\nPantalón:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		pantalon=pantalon*Cantidad;
		
		System.out.println("\nPlayera:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		falda=falda*Cantidad;
		
		System.out.println("\nCamisa:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		camisa=camisa*Cantidad;
		
		System.out.println("\nSaco:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		saco=saco*Cantidad;
		
		System.out.println("\nCinturon:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		cinturon=cinturon*Cantidad;
		
		System.out.println("\nBolsa:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		bolsa=bolsa*Cantidad;
		
		System.out.println("\nCartera:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		cartera=cartera*Cantidad;

		System.out.println("\nTennis:");
		cant = x.readLine(); 
		Cantidad=Integer.parseInt(cant);
		falda=falda*Cantidad;
		
		monto=blusa+falda+pantalon+playera+camisa+saco+cinturon+bolsa+cartera+tennis;
				
		
		cant = x.readLine(); 
			
			descuento=monto*0.20;
			total=monto-descuento;
            System.out.println("El costo total, incluyendo el descuento del 20% aplicable es: "+total);		
		}
}
