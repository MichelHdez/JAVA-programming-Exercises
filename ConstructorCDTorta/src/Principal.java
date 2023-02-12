
public class Principal {

	public static void main(String[] args) {
		String nombre;
		String region;
		double precio;
		
		//constructor vacio
        Torta t = new Torta();
        t.setNombre("milanesa");
        t.setRegion("Sur");
        t.setPrecio(45);
        System.out.println("Torta 1");
        System.out.println("Nombre-->" + t.getNombre());
        System.out.println("Region-->" + t.getRegion());
        System.out.println("Precio-->" + t.getPrecio());
	}

}
