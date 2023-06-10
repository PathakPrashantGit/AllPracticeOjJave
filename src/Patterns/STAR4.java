package Patterns;

public class STAR4 {
	public static void main (String[] args)
{
		for(int a = 1; a<=4; a++)
	{
		for(int i = 2; i<=a; i++)
		{
			System.out.print(" ");
		}
		for(int k=4; k>=a; k--)
		{
			System.out.print("*");
		}
		for(int l=3; l>=a; l--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}

}
