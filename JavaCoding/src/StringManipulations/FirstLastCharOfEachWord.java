package StringManipulations;

public class FirstLastCharOfEachWord {
	public static void main(String[] args) {
		String s = "Hello World and Hello Java Coding";
		printFirstLastChar(s);		
	}
	public static void printFirstLastChar(String s) {
		int n = s.length();
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				System.out.print(s.charAt(i));
			}
			if(s.charAt(i) == ' ') {
				System.out.print(s.charAt(i-1)+" "+s.charAt(i+1));				
			}
		}
	}

}
