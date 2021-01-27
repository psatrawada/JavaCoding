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
		HashMap<Character, Integer>charCount = new HashMap<Character, Integer>();
		char[] ca = s.toCharArray();
		for(char k : ca) {
			if(charCount.containsKey(k)) {
				charCount.put(k, charCount.get(k)+1);
			}		
			else {
				charCount.put(k,1);
			}
		}
		System.out.println(charCount);
	}

}
