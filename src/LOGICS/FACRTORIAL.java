package LOGICS;

public class FACRTORIAL {
	
	public void fact(int i)
	{
		int a = i;
		int sum = 1;
		
		for(int j =1; j<=i; j++)
		{
			sum =sum*j;
		}
		System.out.print(sum);
	}
		
	public static void main (String[] args)
	{
		FACRTORIAL obj = new FACRTORIAL();
		obj.fact(6);
		
	}

}
