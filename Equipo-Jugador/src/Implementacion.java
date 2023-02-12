import java.util.HashMap;

public class Implementacion implements Metodos{
	
	HashMap<Integer, Jugador> hash = new HashMap<Integer, Jugador>();
	Jugador jug;

	@Override
	public void guardar(Object obj) {
		jug = (Jugador) obj;
		hash.put(jug.getClave(), jug);
		
	}

	@Override
	public void editar(Object obj) {
		jug = (Jugador) obj;
		hash.put(jug.getClave(), jug);
	}

	@Override
	public void eliminar(Object obj) {
		hash.remove(jug.getClave());
		
	}

	@Override
	public Object buscar(Object obj) {
		return hash.get(jug.getClave());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println("Hay una cantidad de : " + hash.size() + " jugadores");
	}

	@Override
	public Object buscarPorEquipo(Object obj) {
		jug = (Jugador) obj;
		return hash.get(jug.getNombre());
	}

}
