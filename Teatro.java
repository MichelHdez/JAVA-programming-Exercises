import java.io.*;
	class Teatro{
	public static void main(String arg[])throws IOException {
	BufferedReader x;
	x = new BufferedReader (new InputStreamReader(System.in));
	int entrada =500;
	int edad = 0;
	double descuento =0;
	double costo =0;
	double acum1=0,acum2=0,acum3=0,acum4=0,acum5=0;

	System.out.println("Ingrese la Edad");
	edad = Integer.parseInt(x.readLine());
	if(edad<5)
		System.out.println("no tiene entrada");
	else
		if((edad>=5)&& (edad<=14)){
		descuento =(entrada*0.35);
		costo =(entrada-descuento);
		acum1=(entrada-descuento);
		System.out.println("el pago es :"+costo);
		}

		else
			if((edad>=15)&& (edad<=19)){
			descuento =(entrada*0.25);
			costo =(entrada-descuento);
			acum2=(entrada-descuento);
			System.out.println("el pago es :"+costo);
			}
			else
				if((edad>=20)&& (edad<=45)){
				descuento =(entrada*0.10);
				costo =(entrada - descuento);
				acum3=(entrada - descuento);
				System.out.println("el pago es :"+costo);
				}
				else
					if((edad>=46)&& (edad<=65)){
					descuento =(entrada*0.25);
					costo =(entrada-descuento);
					acum4=(entrada-descuento);
					System.out.println("el pago es :"+costo);
					}
					else
						if((edad>=66)&& (edad<=110)){
						descuento =(entrada * 0.35);
						costo =(entrada-descuento);
						acum4=(entrada-descuento);
						System.out.println("el pago es :"+costo);	
						}
		}
}