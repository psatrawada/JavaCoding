package InterviewQuestions;
import java.util.Arrays;
//0,1,1,2,3,5,8,13,21,34
public class FibonacciSeries {
	public static void main(String[] args) {
		fibno(10);
		System.out.println("Fib(10) " + fib(10));
	}
	public static void fibno(int n) {
		int a = 0;
		int b = 1;
		int fibs[] = new int[n];
		for(int i =0; i<n; i++) {
			int temp = a+b;
			a = b;
			b = temp;
			fibs[i] = b;
		}
		System.out.println("Fibonocci Series: upto "+n + " "+Arrays.toString(fibs));
	}

	public static int fib(int n){
		if(n == 0 || n == 1)
			return 1;
		else
			return (fib(n-1) + fib(n-2));
	}

}
