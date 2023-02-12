import java.util.HashMap;

public class Implementacion implements Metodos {
	
	Transporte trans;
	HashMap<String, Transporte> hash = new HashMap<String, Transporte>();
	public void guardar(Object obj) {
		trans = (Transporte) obj;
		hash.put(trans.getNombre(), trans);
		
	}

	public void editar(Object obj) {
		trans = (Transporte) obj;
		hash.put(trans.getNombre(), trans);
		
	}

	public void eliminar(Object obj) {
		trans = (Transporte) obj;
		hash.remove(trans.getNombre(), trans);
		
	}

	public Object buscar(Object obj) {
		trans = (Transporte) obj;
		return hash.get(trans.getNombre());
	}

	public void mostrar() {
		System.out.println(hash);
		
	}

}
