package StringManipulations;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		int n = s.length();
		reverse(s,n);
		
	}
	public static void reverse(String input, int n ){
		String output = "";
		for(int i=n-1;i>=0; i--) {
			output += input.charAt(i);			
		}		
		System.out.println(input+": is Reversed To: " +output);
		
	}
	

}
