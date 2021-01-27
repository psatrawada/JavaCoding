//Given a string ‘str’ of digits and an integer ‘n’, 
//build the lowest possible number by removing ‘n’ 
//digits from the string and not changing the order of input digits.
//Input: str = "4325043", n = 3   Output: "2043"
//Input: str = "765028321", n = 5 Output: "0221"

package InterviewQuestions;

import java.util.LinkedList;

public class RemoveDigits {

	public static void main(String[] args) {
		
		System.out.println("removed digits " + removeKdigits("4325043",3));
		
	}	
	
	 public static String removeKdigits(String num, int k) {
		    LinkedList<Character> stack = new LinkedList<Character>();
		        
		    for(char digit : num.toCharArray()) {
		      while(stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
		        stack.removeLast();
		        k -= 1;
		      }
		      stack.addLast(digit);
		    }
		        
		    /* remove the remaining digits from the tail. */
		    for(int i=0; i<k; ++i) {
		      stack.removeLast();
		    }
		        
		    // build the final string, while removing the leading zeros.
		    StringBuilder ret = new StringBuilder();
		    boolean leadingZero = true;
		    for(char digit: stack) {
		      if(leadingZero && digit == '0') continue;
		      leadingZero = false;
		      ret.append(digit);
		    }
		        
		    /* return the final string  */
		    if (ret.length() == 0) return "0";
		    return ret.toString();
		  }

}
