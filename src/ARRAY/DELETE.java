package ARRAY;

public class DELETE {
	
	public static void main (String[] args)
	{
		int [] a = {10,20,30,40,50,60};
		int del = 30;
		
		for(int i = 0; i<a.length; i++)
		{
			if(del==a[i])
			{
			   for(int j = i; j<a.length-1; j++)
			   {
				   a[j] = a[j+1]; //j=2 a[2] = 30=40
			   }
			   break;
			}
			
		}
		System.out.print("Element is deleted successfully :-");
	 for(int i = 0; i<a.length-1; i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	}

}
