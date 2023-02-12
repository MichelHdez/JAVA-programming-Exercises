
public interface Metodos {
	public void guardar(Auto auto);

	public void editar(int indice, Auto auto);

	public void eliminar(int indice);

	public Auto buscar(int indice); // objeto de tipo auto porque regresa el valor
	
	public void mostrar();
}
