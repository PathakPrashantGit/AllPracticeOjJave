package ARRAY;

public class Average {
	
	public static void main (String [] args)
	{
		int []a = {30,20,20,20,20};
		int total = 0;
		
		for (int i = 0; i<a.length; i++)
		{
			total = total+a[i];
		}
		
		System.out.println(total/a.length);
	}

}
