package StringManipulations;

public class ReverseStringPalindrome {
	public static void main(String[] args) {
		String s = "madam";
		String s1 = "madame";
		int n = s.length();
		checkPalindrome(s, n);
		checkPalindrome(s1, n);
	}
	public static void checkPalindrome(String s, int n) {
		String t = "";
		for (int i = n - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		if (s.equalsIgnoreCase(t)) {
			System.out.println("Given string: " + s +", is a Palindrome which is: " + t);
		} else
			System.out.println("Given string: " + s + " is Not Palindrome");
	}
}
