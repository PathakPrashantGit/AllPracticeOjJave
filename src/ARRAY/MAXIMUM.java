package ARRAY;

public class MAXIMUM {
	
	public static void main (String[] args)
	{
		int a [] = {52,3,7,53,6};
		
		int max = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Maximum number in array is :- " +max);
	}

}
