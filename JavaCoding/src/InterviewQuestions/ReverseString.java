package InterviewQuestions;

public class ReverseString {
	public static void main(String[] args) {
		String st ="ABCDE FGHIJ";
		System.out.println(st + " ::is reversed to : "+ reverseString(st));		
	}
	
	public static String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}			
		return rev;		
	}

}
