package StringManipulations;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		reverse(s);
		
	}
	public static void reverse(String input ){
		String output = "";
		for(int i=input.length()-1;i>=0; i--) {
			output += input.charAt(i);			
		}		
		System.out.println(input+": is Reversed To: " +output);
		
	}
	

}
