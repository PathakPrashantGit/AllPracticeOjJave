package Muilti_Dimentional_Array;

public class Min_Number {
	
	public static void main(String[] args) {
		int b[][] = {{4,5,9},{8,6,2},{3,3,4}};
		// fimd minimum number in Matrix
		
		int min = b[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				if(min>b[i][j])
				{
					min =b[i][j];
				}
			}
		}
		System.out.println("Minimum number in Matrix is =>"+min);
		
		
	}

}
