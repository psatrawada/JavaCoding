package StringManipulations;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<>();
		map.put("bill",44);
		map.put("kodi",23);
		map.put("kite",23);		
		System.out.println("size of map is: "+map.size());
		
		System.out.println("map content is: "+ map);
		System.out.println("The value of kite " + map.get("kite"));
		System.out.println("All alues in map" + map.values());
		
		
		
		if(map.containsKey("kodi")) {
			Integer i = map.get("kodi");
			System.out.println("The value of kodi " + i);
		}
		
	}
}
