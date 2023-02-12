import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<Integer, Bebida> hash = new HashMap<Integer, Bebida>();

	public void guardar(Bebida bebida) {
		hash.put(bebida.getClave(), bebida);

	}

	public void editar(Bebida bebida) {
		hash.put(bebida.getClave(), bebida);

	}

	public void eliminar(Bebida bebida) {
		hash.remove(bebida.getClave());

	}

	public Bebida buscar(Bebida bebida) {

		return hash.get(bebida.getClave());
	}

	public void mostrar() {
		System.out.println(hash);

	}

}
