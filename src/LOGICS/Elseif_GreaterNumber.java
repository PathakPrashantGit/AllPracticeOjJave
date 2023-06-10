package LOGICS;

public class Elseif_GreaterNumber {
	public static void main (String [] args) {
		
		int a = 50;
		int b = 40;
		int c = 60;
		
		if (a<b)
		{
			System.out.println(" a is greater then b");
			if (b>c)
			{
				System.out.println("b is greater then c");
				if (a>c)
				{
					System.out.println(" a is greater than c");
				}
				else 
				{
					System.out.println("c is greater than a");
				}
				
				
			}
			else
			{
				System.out.println("c is greater than b");
			}
			
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
	}
}
