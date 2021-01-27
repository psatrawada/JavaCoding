package InterviewQuestions;
public class ReverseNum {
	public static void main(String[] args) {
		int a =56741;
		System.out.println("Reverse no " + a + " is: "+ reversenum(a));		
	}
	
	private static int reversenum(int a) {
		int reverse=0;
		int digit;		
		while(a!=0) {
			digit = a%10;
			reverse = digit + reverse*10;
			a= a/10;				
		}
		return reverse;
	}
}
