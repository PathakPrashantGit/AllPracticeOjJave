package Patterns;

public class Pyramid {
	
	public static void main (String[] args)
	{
		for(int a =1; a<=5; a++)
		{
			for(int i=5; i>a; i--)
			{
				System.out.print("  ");
			}
			for(int j =1; j<=a; j++)
			{
				System.out.print("* ");
			}
			for(int k =1; k<a; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
