package StringManipulations;

public class StringToCharsArrayOverloading {
	
	public static void main(String[] args) {
		String s = "Hello world Java";
		int n = s.length();	
		printCharArray(s,n);
		printCharArray(s);
	}
	public static void printCharArray(String s,int n) {
		//creating char array of string length
		char[] ca = new char[n]; 
		for(int i=0; i<n; i++) {
			ca[i] = s.charAt(i);
		}		
		for(int j=0; j<n; j++) {
			System.out.println(ca[j]);
		}
	}
	public static void printCharArray(String s) {
		char[] array = s.toCharArray();		
		for(char k : array) {
			System.out.println(k);
		}
	}

}
