import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		/*HashMap
		 * 
		 * Nos permite tener varios elementos,
		 * y a cada elemento le podemos asociar un key, llave o identificador
		 * para acceder a este valor
		 * */
		HashMap diccionario = new HashMap();
					  //Key ------ Value
		diccionario.put("user", "Homero");
		diccionario.put("youtube", "www.youtube.com");
		diccionario.put("facebook", "www.facebook.com");
		
		String contenido = diccionario.get("youtube").toString();
		boolean respuesta = diccionario.containsKey("facebook");
		diccionario.size();
		System.out.println(diccionario);
		System.out.println(respuesta);
		
	}

}
