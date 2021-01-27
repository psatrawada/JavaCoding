package InterviewQuestions;

public class ReverseStringPalindrome {
	
	public static void main(String[] args) {
		
		String s = "madam";
		String t = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println("Reversed String: "+t);

		if(s.equalsIgnoreCase(t))
		{
			System.out.println("Given string is a Palindrome");
		}
	}

}
