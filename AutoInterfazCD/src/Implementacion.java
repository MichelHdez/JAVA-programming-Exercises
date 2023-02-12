import java.util.ArrayList;
import java.util.List;
	
public class Implementacion implements Metodos {
	
	List<Auto> lista = new ArrayList<Auto>();

	public void guardar(Auto auto) {
		lista.add(auto);
	}

	public void editar(int indice, Auto auto) {
		lista.set(indice, auto);
		
	}

	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		
	}

	public Auto buscar(int indice) {
		Auto a = lista.get(indice);
		return a;
	}

	public void mostrar() {
		System.out.println(lista);
		
	}

	public void contar() {
		System.out.println("lista tiene: " + lista.size() + "autos");	
	}
		
	public void vacia() {
		if(lista.isEmpty()) {
			System.out.println("lista vacia");
		} else {
			System.out.println("lista no está vacia, tiene" + lista.size() + "autos");
		}
	}
			
	public void buscarMarca(Auto auto) {
	for (Auto a:lista) {
		if(a.getMarca().equals(auto.getMarca())) {
			System.out.println("Auto Encontrado :" +a);
		}//if
	}//for
}

	public void eliminarTodo() {
		lista.clear();
		System.out.println("Se eliminaron todos los autos");
		}
	}
