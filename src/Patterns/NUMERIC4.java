package Patterns;

public class NUMERIC4 {
	public static void main (String [] args)
	{
		for(int a = 1; a<=5; a++)
		{
			for(int j = 1; j<=a; j++)
			{
				System.out.print(j+" ");
			}
			for (int k = a-1; k>=1; k--)
			{
				System.out.print(k+" ");
			}
			
			
			System.out.println();
		}
	}

}
