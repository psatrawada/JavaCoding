package StringManipulations;

public class FirstAndLastCharOfString {
	
	public static void main(String[] args) {
		String s = "Hello world and Hello JAVA";
		int n =s.length();
		printFirstAndLast(s,n);
		print_1standLast(s,n);
	}
	public static void printFirstAndLast(String s,int n) {
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				System.out.println("First char: "+ s.charAt(i) + "and Last Char:" +s.charAt(i));
			}
		}
	}
	
	public static void print_1standLast(String s, int n) {		
		System.out.println("First And Last Char: "+ s.charAt(0)+s.charAt(n-1));		
	}

}
