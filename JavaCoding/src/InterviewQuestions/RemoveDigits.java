//Given a string ‘str’ of digits and an integer ‘n’, 
//build the lowest possible number by removing ‘n’ 
//digits from the string and not changing the order of input digits.
//Input: str = "4325043", n = 3   Output: "2043"
//Input: str = "765028321", n = 5 Output: "0221"
package InterviewQuestions;

import java.util.ArrayList;

public class RemoveDigits {
	public static void main(String[] args) {
		String s = "3435631";
		int target = 3;
				
		int n = s.length();
		removeKdigits(s, n, target);
	}

	public static void removeKdigits(String s, int n, int target) {
		//ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == 3) {
				System.out.println(s.charAt(i));
				
				
			}
		}
	}

}
