package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSetConcept {
	
	public static void main(String[] args) {
		hashMapWorks();		
	}
	public static void hashMapWorks() {
	
		HashMap<String, Integer> hmap1 = new HashMap<>();
		hmap1.put("bill",44);
		hmap1.put("kodi",23);
		hmap1.put("kite",23);		
		System.out.println("size of map is: "+hmap1.size());
		
		//System.out.println("Print map content is: "+ hmap1);
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
		
		System.out.println("Iterating the map values using Iterator");
		Set st = hmap1.entrySet();		
		Iterator i = st.iterator();			
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			//Map.Entry<String, Integer> me = i.next();
			System.out.println(me.getKey());  
			System.out.println(me.getValue());
			//System.out.println(me);
		}		
	}	
}
