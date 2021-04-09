package InterviewQuestions;
public class SumOFString {
	public static void main(String[] args) {
		String s = "a12d34c";
		String s1 = "333ab3";
		char[] ch = s.toCharArray();
		int n = s.length();
		int n1 = s1.length();
		int sum = sumTheString(ch,n);
		System.out.println("Sum of String S = " + sum);
		sumOfString(s1,n1);
	}
	private static int sumTheString(char[] ch, int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			if(Character.isDigit(ch[i])) {
				int a = Integer.parseInt(String.valueOf(ch[i]));
				sum += a;
				//System.out.println(sum);
			}				
		}
		return sum;
	}
	public static void sumOfString(String s, int n) {
		int sum = 0;
		for(int i =0; i<n; i++) {
			if(Character.isDigit(s.charAt(i)))				
				sum +=  Integer.parseInt(String.valueOf(s.charAt(i)));								
			
		}
		System.out.println("Sum the string S1: " + sum);
		
	}

}
