package InterviewQuestions;
//using recursive method
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Factorial of "+ 5 + ": "+ factorialOf(5));
		System.out.println("Factorial of "+ 10 + ": "+ factorialOf(10));
	}
	public static int factorialOf(int n) {
		if(n==1) {
			return(1);
		}
		return(factorialOf(n-1)*n);
	}

}
