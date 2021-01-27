package InterviewQuestions;

import java.util.Arrays;

public class ascendSortArray {

	public static void main(String[] args) {
		int[] a = { 6, 3, 1, 9, 5 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				//System.out.println("a[" + i + "] " + a[i]);
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("Sorted array: " + Arrays.toString(a));
	}

}
