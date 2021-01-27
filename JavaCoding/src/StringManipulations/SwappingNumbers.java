package StringManipulations;

public class SwappingNumbers {	
	public static void main(String[] args) {
		int x = 23;
		int y = 33;		
		System.out.println("Before swapping x=" +x +" y= "+y);	
		swapWithoutTemp(x,y);
		swapWithoutTemp(x,y);
	}
	public static void swapWithoutTemp(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping without Temp x=" + a +" y= "+b);
	}
	public static void swapWithTemp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping with Temp x=" + a +" y= "+b);
	}

}
