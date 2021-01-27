//Given array of integers, return indices of two numbers whose sum to a specific target
//input = [2,6,3,4,5,4,3,1,7], target = 8
package InterviewQuestions;

public class SumOf2NumToTarget {
	public static void main(String[] args) {
		int[] num = {2,6,3,4,5,4,3,4};
		int target = 8;
		int n = num.length;
		
		getIndSumToTarget(num,target,n);		
	}
	public static void getIndSumToTarget(int[] s, int t, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(s[i]+s[j] == t) {
					System.out.println("Target found at index "+ i +" And " + j);					
				}				
			}
		}		
	}
}
