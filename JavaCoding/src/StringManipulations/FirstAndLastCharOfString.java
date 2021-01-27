package StringManipulations;

public class FirstAndLastCharOfString {
	
	public static void main(String[] args) {
		String s = "Hello world and Hello JAVA";
		printFirstAndLast(s);
	}
	public static void printFirstAndLast(String s) {
		int n =s.length();
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				System.out.println("First char: "+ s.charAt(i) + "and Last Char:" +s.charAt(i));
			}
		}
	}

}
