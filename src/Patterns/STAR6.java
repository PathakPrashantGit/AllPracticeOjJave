package Patterns;

public class STAR6 {
	public static void main (String[] args) 
	{
		for(int a= 1; a<=5; a++)
		{
			for(int j = 5; j>=a; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=a; k++)
			{
				if(a>=2 && k>1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
