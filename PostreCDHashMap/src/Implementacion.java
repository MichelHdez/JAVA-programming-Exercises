import java.util.HashMap;

public class Implementacion implements Metodos{

	HashMap<String, Postre> hash = new HashMap<String, Postre>(); 
	public void guardar(Postre postre) {
		hash.put(postre.getNombre(), postre);
		
	}

	public void editar(Postre postre) {
		//se sobreescribe y no hay necesidad de recorrer
		hash.put(postre.getNombre(), postre);
		
	}

	public void eliminar(Postre postre) {
		hash.remove(postre.getNombre());
	}

	public Postre buscar(Postre postre) {
		return hash.get(postre.getNombre());
	}

	public void mostrar() {
		System.out.println(hash);
		
	}

}
