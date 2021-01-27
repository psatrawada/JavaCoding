package InterviewQuestions;
//Two Dimension Array Interview Questions: Find the min number of matrix and then find the max number of that column

public class PrintMinOfMatrix {

	public static void main(String[] args) {		

		int a[][] = {{10,20,30},{5,22,33},{45,25,35},{11,2,3}};
		int min = a[0][0];
		int minCol=0;
		for (int i =0; i<4; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (min > a[i][j]) {
					min = a[i][j];
					minCol = j;	
				}
				//System.out.println("element[i][j] : "+ a[i][j]);
			}
		}
		System.out.println("The minium num of the matrix is : "+ min + " and it is in : "+ minCol + " column" );
		
		int k=0;
		int max = a[k][minCol];
		while(k<3)
		{
			if(max < a[k+1][minCol])
			{
				max = a[k+1][minCol];
			}
			k++;
			
		}
		
		
		System.out.println("The maximum num of the " + minCol+" column is : "+ max);

	}

}
