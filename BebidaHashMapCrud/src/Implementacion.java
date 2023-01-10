import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<Integer, Bebida> hash = new HashMap<Integer, Bebida>();

	public void guardar(Bebida bebida) {
		hash.put(bebida.getClave(), bebida);

	}

	@Override
	public void editar(Bebida bebida) {
		hash.put(bebida.getClave(), bebida);

	}

	@Override
	public void eliminar(Bebida bebida) {
		hash.remove(bebida.getClave());

	}

	@Override
	public Bebida buscar(Bebida bebida) {

		return hash.get(bebida.getClave());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

}
