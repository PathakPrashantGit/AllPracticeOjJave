package Patterns;

public class NUMERIC5 {
	public static void main (String [] args)
	{
		for (int a = 1; a<=5; a++)
		{
			for(int j=5; j>=a; j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
