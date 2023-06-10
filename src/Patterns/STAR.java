package Patterns;

public class STAR
{
	
	public static void main (String [] args)
	{
	
		for (int a = 1; a<=5; a++) 
		{
			for (int j = 4; j>=a; j--) 
			{
				System.out.print(" ");
			}
			
			for(int k= 1; k<=a; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 1; a<=5; a++)
		{
			for(int j = 1; j<=a; j++)
			{
				System.out.print(" ");
			}
			for(int k =4; k>=a; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
		
		
	
	

}

