import java.util.HashMap;

                             //Nombre Interfez
public class Implementacion implements Metodos{
	//Damos las instrucciones para que hagan las acciones a realizar

	//se van a estar guardando objetos de tipo mascota
	HashMap<String, Mascota> hash = new HashMap<String, Mascota>();
	Mascota mascota;
	
	public void guardar(Object obj) {
		//recibe un parametro de tipo objeto
		mascota = (Mascota) obj;
		hash.put(mascota.getNombre(), mascota);
	}

	public void editar(Object obj) {
		mascota = (Mascota) obj;
		hash.put(mascota.getNombre(), mascota);
		
	}

	public void eliminar(Object obj) {
		//pasar el valor del key en el caso de eliminar
		mascota = (Mascota) obj;
		hash.remove(mascota.getNombre());
		
	}

	public Object buscar(Object obj) {
		mascota = (Mascota) obj;
		return hash.get(mascota.getNombre());
	}

	public void mostrar() {
		System.out.println(hash);
		
	}
	
	public void contar() {
		int contador = hash.size();
		System.out.println("El hash tiene " + contador + " mascotas");
	}

}
