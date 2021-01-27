//Given an array nums of n integers and an integer target,
package InterviewQuestions;
import java.util.ArrayList;

public class UniqueNoArray {

	public static void main(String[] args)
	{
		int a[] = {4,5,6,5,5,6,7,4,3};		
		ArrayList<Integer> alist = new ArrayList<Integer>();	
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			if(!alist.contains(a[i]))
			{
				alist.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{						
						k++;
					}
					
				}	
				//System.out.println("num: " + a[i] + "is present "+  k);
				if(k==1)
					result.add(a[i]);
					
			}		
			
		}
		System.out.println(result + " is the unique element");
	}

}
