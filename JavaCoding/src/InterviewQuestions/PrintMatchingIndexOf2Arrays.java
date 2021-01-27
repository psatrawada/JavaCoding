package InterviewQuestions;

import java.util.ArrayList;

public class PrintMatchingIndexOf2Arrays {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 10, 15 };
		int[] b = { 2, 3, 5, 10, 15 };
		
		matchingIndex(a, b);		
	}

	private static void matchingIndex(int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				result.add(a[i]);
			}
		}
		System.out.println("result as list"+ result);
		
		//To convert arrayList to Array
		Object[] c = result.toArray();
		//enhaced for loop syntax:- for(int i:arr){  
		for(Object k:c) {
			System.out.println(k);	

		}
	}

}
