import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	
	List<Sopa> lista = new ArrayList<Sopa>();
	
	public void guardar(Sopa sopa) {
		lista.add(sopa);
	}

	public void editar(int indice, Sopa sopa) {
		lista.set(indice, sopa);
		
	}

	public void eliminar(int indice) {
		lista.remove(indice);
		
	}

	public Sopa buscar(int indice) {
		Sopa s = lista.get(indice);
		return s;
	}

	public void mostrar() {
		System.out.println(lista);
		
	}

	public void contar() {
		System.out.println("La lista tiene : " + lista.size() + " sopas");	
	}
			
	public void buscarNombre(Sopa sopa) {
	for (Sopa s:lista) {
		if(s.getNombre().equals(sopa.getNombre())) {
			System.out.println("La sopa encontrada es :" +s);
		}
	}//for
}	
	
}

