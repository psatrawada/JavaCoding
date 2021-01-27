package StringManipulations;

public class ThirdCharOfEachWord {
	public static void main(String[] args) {
		String s = "Hello world and Hello Java Coding";
		printThridChar(s);
	}
	public static void printThridChar(String s) {
		int n = s.length();
		for(int i=0; i<n; i++) {
			if(i==2) {
				System.out.print(s.charAt(i));
			}
			if(s.charAt(i) == ' ') {
				System.out.print(s.charAt(i+3));
			}
		}
	}

}
