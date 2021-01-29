package InterviewQuestions;

import java.util.Arrays;
//{11,3,6,12,23} output: 20
public class MaxDiffOfElementsInArray {
	
	public static void main(String[] args) {
		int[] a = {11,13,6,12,23};
		int n = a.length;
		sortAndMaxDiffOfElements(a,n);	
		maxDiffOfElements(a,n);
	}
	private static void sortAndMaxDiffOfElements(int[] a, int n) {
		int temp;
		for(int i=0; i< n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}					
		}
		System.out.println("sorted list "+ Arrays.toString(a));	
		System.out.println("MaxDiff of sorted last-first: "+ (a[n-1]-a[0]));
	}
	private static void maxDiffOfElements(int[] a, int n) {
		int maxDiff=0;
		for(int i=0; i< n; i++) {
			for(int j=i+1; j<n; j++) {
				if((a[j]-a[i])>maxDiff) {
					maxDiff = a[j]-a[i];
				}				
			}					
		}
		System.out.println("MaxDiff Between Elements: "+ maxDiff);			
	}
}
