package StringManipulations;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
	public static void main(String[] args) {
	
		HashMap<String, Integer> hmap1 = new HashMap<>();
		hmap1.put("bill",44);
		hmap1.put("kodi",23);
		hmap1.put("kite",23);		
		System.out.println("size of map is: "+hmap1.size());
		
		System.out.println("Print map content is: "+ hmap1);
		System.out.println("Print all Keys in map"+hmap1.keySet());			
		System.out.println("Print all values in map" + hmap1.values());	
		
		for(String key: hmap1.keySet()) {
			System.out.println(key);
		}
		
		if(hmap1.containsKey("kodi")) {
			Integer i = hmap1.get("kodi");
			System.out.println("The value of kodi " + i);
		}
		System.out.println("The value of kite_key is " + hmap1.get("kite"));
	}
}
