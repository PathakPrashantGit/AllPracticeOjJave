package Patterns;

public class STAR9 
{
	public static void main (String [] args)
	{
		for (int a=0; a<5; a++)
		{
			for(int j=0; j<5; j++)
			{
				if (a==j || a+j==5-1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
