
package InterviewQuestions;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: 1 to 4 ");
		int age = input.nextInt();	
		//int age = 1;
				
		switch(age) {
			case 1:
				System.out.println("If Age categore is : "+age+ " they are Toddler");
				break;
			
			case 2:
				System.out.println("If Age categore is : "+age+ " they are  Teens");
				break;
				
			case 3:
				System.out.println("If Age categore is : "+age+ " they are  Adults");
				break;
				
			case 4:
				System.out.println("If Age categore is : "+age+ " they are  Senior");
				break;
		}
		System.out.println("Switch case is Done");
	
	}

	
}
