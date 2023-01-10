import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<String, Postre> hash = new HashMap<String, Postre>();

	public void guardar(Postre postre) {
		hash.put(postre.getNombre(), postre);

	}

	@Override
	public void editar(Postre postre) {
		hash.put(postre.getNombre(), postre);

	}

	@Override
	public void eliminar(Postre postre) {
		hash.remove(postre.getNombre());

	}

	@Override
	public Postre buscar(Postre postre) {

		return hash.get(postre.getNombre());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

}
