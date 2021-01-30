package InterviewQuestions;
import java.util.ArrayList;

public class Prime {	
	public static void main(String[] args) {	
		int n = 13;		
    	System.out.println("Given num: "+n + " is prime: "+ isPrime(n));
		System.out.println("List of prime numbers up to "+n +" is :"+ printAllPrime(n));		
		System.out.println("The next prime no: "+ Prime.nextPrime(n));

	}
	
	//To find the next prime number
	private static int nextPrime(int num) {
        num++;
        for (int i = 2; i <num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            }             
        }
        return num;
    }
	//To find whether given no is prime
	private static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
            	return false;            	    
            }   
        }
    return true;        
    }	
	//print prime nos in arraylist
	private static  ArrayList<Integer> printAllPrime(int n) {
	ArrayList<Integer> plist = new ArrayList<Integer>();
		for (int i =1; i<=n; i++) {
			if(Prime.isPrime(i))
				plist.add(i);			
		}
    return plist;        
    }	
	

	
}
