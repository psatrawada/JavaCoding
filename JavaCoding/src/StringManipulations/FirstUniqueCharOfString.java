package StringManipulations;
import java.util.ArrayList;

public class FirstUniqueCharOfString {
	public static void main(String[] args) {
		String s = "Hello world And Hello Java";
		int n = s.length();
		//char letter = printFirstUniqueChar(s,n);
		//System.out.println("The first unique alphabet is: " + letter);
		System.out.println("The first unique alphabet is: " + printFirstUniqueChar(s,n));
	}
	public static char printFirstUniqueChar(String s, int n) {
		char[] ca = s.toCharArray();
		ArrayList<Character> alist = new ArrayList<Character>();
		for(int i=0; i<n; i++) {
			if(!alist.contains(ca[i])) {
				alist.add(ca[i]);								
			}			
		}
		//System.out.println(alist.get(0));
		return(alist.get(0));
	}
}
