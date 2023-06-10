package LOGICS;

public class PRIME2 {
	public static void main (String[] args)
	{
		
		for(int a = 1; a<=20; a++)
		{
			int f=0;
			for(int b = 2; b<=a-1; b++)
			{
				if (a%b==0)
				{
					f=f+1;
				}
			}
				if(f==0)
				{
					System.out.println(a+ " is prime number");
				}
				else
				{
					System.out.println(a+ " is not prime number");
				}
			
		}
	}

}
