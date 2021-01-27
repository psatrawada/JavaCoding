package StringManipulations;
import java.util.ArrayList;

public class RemoveDuplicatechars {
	public static void main(String[] args) {
		String s = "Hello world Hello java";
		int n=s.length(); 
		removeDuplicate(s,n);		
	}
	public static void removeDuplicate(String s, int n) {		
		char[] ca = s.toCharArray();
		ArrayList<Character> alist = new ArrayList<Character>();
		for(int i=0; i<n; i++) {
			if (!alist.contains(ca[i])) {
				alist.add(ca[i]);				
			}			
		}
		System.out.println(alist);
	}
	
}
