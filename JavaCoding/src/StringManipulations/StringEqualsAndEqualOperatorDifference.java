package StringManipulations;
//In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
public class StringEqualsAndEqualOperatorDifference {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		
			System.out.println(".equals operator compares contents: "+ s1.equals(s2));			
			System.out.println("==opertor compares by reference/addresses:"+(s1==s2));
				
	}

	
}
