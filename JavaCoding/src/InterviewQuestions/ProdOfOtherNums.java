package InterviewQuestions;
import java.util.Arrays;
// Input list  [1,2,3,4] should return output [24,12,8,6]
public class ProdOfOtherNums {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 2,0 };
		int[] a1 = {1,2,3,5};
		int n = a.length;
		int n1 = a1.length;
		findProduct(a, n);
		findProduct(a1, n1);
	}
	public static void findProduct(int[] a, int n) {
		int[] L = new int[n];
		int[] R = new int[n];	
		L[0] = 1;
	    for (int i = 1; i < n; i++) {
	        L[i] = a[i - 1] *L[i - 1];
	        System.out.println("Left_index_" + i +" :"+L[i]);
	    }
	    R[n - 1] = 1;
	    for (int j=n-2; j>=0; j--) {
	        R[j] = a[j+1] * R[j+1];
	        System.out.println("Right_index_" + j +" :"+R[j]);
	    }
	    for(int k=0; k<n; k++) {
	    	a[k] = L[k]*R[k];	
	    	System.out.println("ProductOfOthers_"+k+" :" + a[k]);
	    }
	    System.out.println("ProductOfOthers List "+Arrays.toString(a));
	}

}
