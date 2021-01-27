package InterviewQuestions;

public class MaxDiffOfElementsInArray {
	
	public static void main(String[] args) {
		int[] a = {1,3,6,12,23};
		int result = diffOfElements(a);
		System.out.println("Max difference between elements in an array: "+ result);
	}

	private static int diffOfElements(int[] a) {
		int diff = 0;
		for(int i=0; i< a.length-1; i++) {
			if(a[i+1]- a[i] > diff)
				diff = a[i+1]- a[i];
		}		
		return diff;
	}


}
