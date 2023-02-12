public class Principal {

	public static void main(String[] args) {
		System.out.println("Director");
		Director d = new Director();
		d.departamento = "finanzas";
		d.edad=30;
		d.nombre="Jose";
		d.salario=1000;
		d.getFechaIngreso();
		System.out.println(d);
		
		System.out.println();
		
		//String nombre, int edad, int fechaIngreso, double salario, double bono, int nivel
		System.out.println("Operario");
		Operario o = new Operario();
		System.out.println(o);
		o.incentivar();
		
		
	}
}