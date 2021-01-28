package StringManipulations;
import java.util.HashMap;

public class FirstUniqueCharOfString {
	public static void main(String[] args) {
		String s = "Hello world and Hello Java"; //ans=w
		int n = s.length();
		printFirstUniqueChar(s,n);
	}
	
	public static void printFirstUniqueChar(String s, int n) {
		char[] ca = s.toCharArray();
		HashMap<Character,Integer> hmap1 = new HashMap<Character,Integer>();
		
		for(char c: ca) {
			if(hmap1.containsKey(c)) {
				hmap1.put(c, hmap1.get(c)+1);								
			}	
			else{
				hmap1.put(c,1);				
			}			
		}
		System.out.println("Count of each character: " + hmap1);
        for (int i = 0; i < n; i++) {
            if (hmap1.get(s.charAt(i)) == 1) 
            	System.out.println("Index "+ i+ " has Unique char: "+s.charAt(i));
            	//System.out.println(s.charAt(i));
        }
	}
}
