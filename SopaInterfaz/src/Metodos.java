
public interface Metodos {
	public void guardar(Sopa sopa);

	public void editar(int indice, Sopa sopa);

	public void eliminar(int indice);

	public Sopa buscar(int indice); // objeto de tipo auto porque regresa el valor
	
	public void mostrar();
}
