package StringManipulations;
//Given alphanumeric string,  program to remove all the digit from this string and prints the modified string.
//Input: str = “12Java” Output: Java

public class RemoveAllDigits {

	public static void main(String[] args) {
		String s = "123JavaCoding:18";		
		char[] ca = s.toCharArray();
		int n = ca.length;
	}
	public static void removeDigits(char[] ca, int n) {
		String result = "";
		for(int i=0; i<n; i++) {
			if(!Character.isDigit(ca[i])) {
				result += ca[i];  // concatenating String with chars					
			}
		}
		System.out.println(result);		
	}
}
