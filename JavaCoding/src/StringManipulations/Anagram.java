package StringManipulations;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "RACE";
		String s2 = "CARE";
		String s3 = "ACRRE";
		checkAnagram(s1,s2);	
		checkAnagram(s1,s3);
	}
	
	public static void checkAnagram(String x, String y) {
		if(x.length() == y.length()) {
			char[] ca1 = x.toCharArray();
			char[] ca2 = y.toCharArray();
			
			Arrays.sort(ca1);
			Arrays.sort(ca2);
			
			boolean result = Arrays.equals(ca1, ca2);
			
			if(result){
				System.out.println(x + " AND " + y + " is Anagram");
			}	
			else {
				System.out.println(x + " AND " + y + " is Not Anagram");	
			}
		}
		else {
			System.out.println(x + " AND " + y + " is Not Anagram");	
		}
	}

}
