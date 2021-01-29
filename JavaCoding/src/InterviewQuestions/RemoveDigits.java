//Given a string str of digits and an integer n, 
//build the lowest possible number by removing n 
//digits from the string and not changing the order of input digits.
//Input: str = "4325043", n = 3   Output: "2043"
//Input: str = "765028321", n = 5 Output: "0221"
package InterviewQuestions;

public class RemoveDigits {
	public static void main(String[] args) {
		String s = "34353631";
		char target = '3';				
		int n = s.length();
		removeKdigits(s, n, target);
	}

	public static void removeKdigits(String s, int n, char target) {
		String result = "";
		for(int i=0; i<n; i++) {
				if(!(s.charAt(i)== target)){
					result += s.charAt(i);					
				}				
		}
		System.out.println("String \""+ s+ "\" without the digit " + target+ " is: "+result);
	}

}

