
public abstract class SuperHeroes {
	String nombre;
	String app;
	String nomHeroe;
	String poder;
	String ciudad;

	// metodo no abstracto
	public void salvar(int personas) {
		System.out.println("Salve la cantidad de : " + personas + " personas");
	}

	// metodo abstracto
	public abstract void trabajar();

	public SuperHeroes() {

	}

	public SuperHeroes(String nombre, String app, String nomHeroe, String poder, String ciudad) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.nomHeroe = nomHeroe;
		this.poder = poder;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getNomHeroe() {
		return nomHeroe;
	}

	public void setNomHeroe(String nomHeroe) {
		this.nomHeroe = nomHeroe;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
