package LOGICS;

public class PRIME1 {
	public static void main (String[] args)
	{
		
		int no = 9;
		int f = 0;
		
		for (int i = 2; i<no; i++) 
		{
			if (no%i==0) 
			{
				 f = f+1;
				 
				 
			}
		}
		if (f>0)
		{
			System.out.println("not prime number -:" +no);
		}
		else if (f==0)
		{
			System.out.println("number is prime number -:" +no);
		}
		}

}
