package StringManipulations;

public class IndexOfAnCharacterAndCount{
	
	public static void main(String[] args) {
		String s = "Hello world and Hello Java coding";
		int n = s.length();
		char achar = 'o';
		printIndexAndCount(s,n,achar);
		printRemovingAChar(s, n, achar);
	}
	public static void printIndexAndCount(String s, int n, char ac) {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i)== ac) {
				count ++;
				System.out.println("O is at index:"+ i);
			}
		}	
		System.out.println("Number of times O occured in the string: "+ count);		
	}
	public static void printRemovingAChar(String s, int n, char ac) {
		for(int j=0; j<n; j++) {
			if(!(s.charAt(j) == ac)) {
				System.out.print(s.charAt(j));
			}
		}
		
	}

}
