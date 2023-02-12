import java.util.HashMap;

public class Implementacion implements Metodos {

	Framework frame;
	HashMap<String, Framework> hash = new HashMap<String, Framework>();

	public void guardar(Object obj) {
		frame = (Framework) obj;
		hash.put(frame.getNombre(), frame);
	}

	
	public void editar(Object obj) {
		frame = (Framework) obj;
		hash.put(frame.getNombre(), frame);

	}

	
	public void eliminar(Object obj) {
		frame = (Framework) obj;
		hash.remove(frame.getNombre(), frame);
	}

	public Object buscar(Object obj) {
		frame = (Framework) obj;
		return hash.get(frame.getNombre());
	}

	
	public void mostrar() {
		System.out.println(hash);

	}

}
