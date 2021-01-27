package InterviewQuestions;

public class MultiplyTwoNosWithoutoperator {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		int prod = multiply(i, j);
		System.out.println("product of two nos without opertor: "+ prod);
	}

// Multiply two numbers without using multiplication operator available in Java
	private static int multiply(int i, int j) {
		int k = 1;
		int prod = 0;
		while (k<=j) {
			prod += i;
			k++;			
		}
		return prod;
	}

}
