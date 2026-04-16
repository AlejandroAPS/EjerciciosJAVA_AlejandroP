import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;


public class Principal {

	public static void main(String[] args) {
		Map<String, String> nombres = new HashMap<String, String>();
		
		nombres.put("51666443R", "Carlos Maldonado Gómez");
		nombres.put("51666443R", "Luis Santos Gómez");
		nombres.put("52666443A", "Alicia Torres Durán");
		nombres.put("31234443H", "Alfonso González Torres");
		
		
		System.out.println(nombres.get("31234443H"));
		System.out.println(nombres);
		
		Set<String> llaves = nombres.keySet();
		
		for (String n : llaves) {
			System.out.println(n + " " + nombres.get(n));
		}
		
		Collection<String> valores = nombres.values();
		for (String nom : valores) {
				System.out.println(nom);
		}
	}

}
