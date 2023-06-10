package Muilti_Dimentional_Array;

public class Class1 {
	
	public static void main(String[] args)
	{
		//Multi-Dimentional Array
		int a[][] = new int [2][3]; // 1 2 3  --- x-Axis
		                           //  4 5 6  --- y-axis
		a[0][0] =1;
		a[0][1]= 2;
		a[0][2] =3;
		a[1][0] =4;
		a[1][1] =5;
		a[1][2] =6;
		
		//print  second row and first column
		System.out.println(a[1][0]);
		
		//Another way to declare the Muilti-Dimentional array
		
		int b[][] = {{1,2,3},{4,5,6}};
		
		System.out.println(b[0][2]);
		
		for(int i =0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
