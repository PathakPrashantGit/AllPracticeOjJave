package Patterns;

public class STAR8 {
	public static void main (String [] args)
	{
		for (int a= 5; a>=1; a--) 
		{
			for (int j = 5; j>a; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<a*2; k++)
			{
				if(k>1 && k<(a*2)-1)
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
