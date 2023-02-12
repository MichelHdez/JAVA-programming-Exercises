
public abstract class Figura {
	protected double x;
	protected double y;
	
	protected Figura() {
		
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}


	/*Se declara el método y no se implementa
	los metodos lo pueden heredad e implementar como quieran*/
	public abstract double calcularArea();
}
