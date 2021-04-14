package InterviewQuestions;
import java.util.Arrays;
public class SumArray {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10 };
		int sum = sumOfArray(a);
		System.out.println("Print Array a{}" + " "+ Arrays.toString(a));
		System.out.println("Sum of array " + sum);
	}
	private static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

}
