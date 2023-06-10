package Patterns;

public class Star_004 {
	public static void main (String [] args)
	{
		for(int a=1; a<=5; a++)
		{
			for(int i=2; i<=a; i++)
			{
				System.out.print("  ");
			}
			for(int j=5; j>=a; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
