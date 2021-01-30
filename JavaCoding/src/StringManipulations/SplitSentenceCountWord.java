package StringManipulations;
import java.util.Arrays;
import java.util.HashMap;

public class SplitSentenceCountWord {
	public static void main(String[] args) {
		String s = "Hello Porkodi! Hello this is Java Hello this is Java coding";
		String[] sarray = s.split(" ");
		System.out.println(Arrays.toString(sarray));
		int n = sarray.length;
		
		countEachWord(sarray,n);
	}

	public static void countEachWord(String[] sa, int n) {
		HashMap<String,Integer>hmap1 = new HashMap<String, Integer>();
		for(String s: sa) {
			if(hmap1.containsKey(s))
				hmap1.put(s,hmap1.get(s)+1);
			else
				hmap1.put(s,1);			
		}
		System.out.println(hmap1);
		System.out.println("Hello occured "+hmap1.get("Hello")+ " times");
		System.out.println("Java occured "+hmap1.get("Java")+ " times");
		
	}

}
