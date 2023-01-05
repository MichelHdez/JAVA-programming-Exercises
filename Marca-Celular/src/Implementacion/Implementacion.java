package Implementacion;

import java.util.HashMap;

import Entidad.Celular;
import Entidad.Marca;

public class Implementacion implements Metodos{
	
	HashMap<String, Celular> hash = new HashMap<String, Celular>();
	HashMap<String, Marca> m = new HashMap<String, Marca>();
	Celular cel;
	Marca mar;
	
	
	@Override
	public void guardar(Object obj) {
		cel = (Celular) obj;
		hash.put(cel.getModelo(), cel);
	}

	@Override
	public void editar(Object obj) {
		cel = (Celular) obj;
		hash.put(cel.getModelo(), cel);
		
	}

	@Override
	public void eliminar(Object obj) {
		cel = (Celular) obj;
		hash.remove(cel.getModelo(), cel);
		
	}

	@Override
	public Object buscar(Object obj) {
		cel = (Celular) obj;
		return hash.get(cel.getModelo());
	}
	
	@Override
	public void mostrar() {
		System.out.println(hash);
	}
	
	public void contar() {
		System.out.println("Hay una cantidad de : " + hash.size() + " celulares");
	}
	
	@Override
	public void guardarPorMarca(Object obj) {
		mar = (Marca) obj;
		m.put(mar.getNombre(), mar);
	}
	
	@Override
	public Object buscarPorMarca(Object obj) {
		mar = (Marca) obj;
		return m.get(mar.getNombre());
	}

}
