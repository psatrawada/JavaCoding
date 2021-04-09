//Given a string ‘str’ of digits and an integer ‘n’, 
//build the lowest possible number by removing ‘n’ 
//digits from the string and not changing the order of input digits.
//Input: str = "4325043", n = 3   Output: "2043"
//Input: str = "765028321", n = 5 Output: "0221"
package InterviewQuestions;

public class RemoveTargetDigit{
	public static void main(String[] args) {
		String s = "343dd3";
		char target = '3';				
		int n = s.length();
		removeTDigit(s, n, target);
		sumOfString(s,n);
	}

	public static void removeTDigit(String s, int n, char target) {
		String result = "";
		for(int i=0; i<n; i++) {
				if(!(s.charAt(i)== target)){
					result += s.charAt(i);					
				}				
		}
		System.out.println("String \""+ s+ "\" without the digit " + target+ " is: "+result);
	}
	public static void sumOfString(String s, int n) {
		int sum = 0;
		for(int i =0; i<n; i++) {
			if(Character.isDigit(s.charAt(i)))				
				sum +=  Integer.parseInt(String.valueOf(s.charAt(i)));
			
				System.out.println(sum);				
			
		}
	}
}

