package InterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum;
		
		int i=1;
		while(i<9) {
			sum = a+b;
			System.out.println("Fibonocci Series: "+sum);
			a=b;
			b=sum;			
			i++;
		}
		
	}
}
