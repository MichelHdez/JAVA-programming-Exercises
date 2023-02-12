import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();

	public void guardar(Object key, Object value) {
		hash.put(key, value);

	}

	public void editar(Object key, Object value) {
		hash.put(key, value);

	}

	public void eliminarr(Object key) {
		hash.remove(key);

	}

	public Object buscar(Object key) {
		return hash.get(key);
	}

	public void mostrar() {
		System.out.println(hash);
	}

}
