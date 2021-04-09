package StringManipulations;

public class ReverseString {
	
	public static void reverse(String input){
		char [] carr = input.toCharArray();
		int n = carr.length;
		for(int i=n-1; i>=0; i--) {
			System.out.print(carr[i]);
		}	
		System.out.println();
		
	}
	
	public static void reverseWords(String input) {
		String [] temp = input.split(" ");
		int x = temp.length;
		String output = "";
		
		for(int i=0; i<x; i++) {
			if(i == x - 1) 
				output = temp[i] + output;
			else
				output = " " +temp[i] + output;
		}
		System.out.println(output);
		
	}
	
	public static void main(String[] args) {		
		String s = "Hello World I love Java";
		reverse(s);
		reverseWords(s);
		
	}
	

}
