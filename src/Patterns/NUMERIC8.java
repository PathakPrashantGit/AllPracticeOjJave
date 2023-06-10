package Patterns;

public class NUMERIC8 
{
	public static void main (String [] args)
	{
     int count = 0;
		for(int a =1; a<=4; a++)
		{
			if (a%2!=0)    
			{
				for (int j = 1; j<=3; j++)
				{
					count = count+1;
					System.out.print(count+" ");
				}
			}
				else
				{
					int temp = count+1;
					for(int k = count+3; k>=temp; k--)
					{
						count = count+1;
						System.out.print(k+" ");
					}
					
				}
				
			System.out.println();	
				
			}
		}
			
			
			
	}
			

