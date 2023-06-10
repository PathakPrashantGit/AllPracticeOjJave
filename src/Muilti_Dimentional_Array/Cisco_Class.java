package Muilti_Dimentional_Array;

public class Cisco_Class {
	public static void main(String[] args) {
		

	
	int a[][] = {{4,5,9},{8,19,1},{8,3,2}};
	int min =a[0][0];
	int mincolum =0;
	int row =0;
	
	for(int i =0; i<3; i++)
	{
		for(int j =0;j<3; j++)
		{
			if(min>a[i][j])
			{
				min = a[i][j];
				mincolum =j;
				row =i;
			}
		}
	}
	int max =a[row][mincolum];
	int k =0;
	while(k<3)
	{
		if(a[k][mincolum]>max) {
		max =a[k][mincolum];
		}
		k++;
	}
	
	System.out.println(max);

}
}
