package ARRAY;

public class ASCENDING_2 {

	public static void main(String[] args)
	{
		int[] a = {40,60,20,90,30,80};
		
		int t=0;
		
		for(int i =0; i<a.length; i++)
		{
			for(int j = i; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					t=a[i];
					a[i] = a[j];
					a[j]= t;
					
				}
				
			}
			System.out.print(a[i]+ " ");
		}
		
	}


}
