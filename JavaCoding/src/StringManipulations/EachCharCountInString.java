package StringManipulations;
import java.util.HashMap;
public class EachCharCountInString {
	public static void main(String[] args) {
		String s = " Hello world And Hello Java coding";
		String s1 = "PorkodiPorkodi";
		
		printCharCount(s);
		printCharCount(s1);
	}
	public static void printCharCount(String s) {
		HashMap<Character, Integer>hmap1 = new HashMap<Character, Integer>();
		char[] ca = s.toCharArray();
		for(char k : ca) {
			if(hmap1.containsKey(k)) {
				hmap1.put(k, hmap1.get(k)+1);
			}		
			else {
				hmap1.put(k,1);
			}
		}
		System.out.println(hmap1);
	}

}
