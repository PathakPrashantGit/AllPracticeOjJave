package ARRAY;

public class ASCENDING {
	
	public static void main (String[] aegs)
	{
		int a[] = {5,8,6,3,7,1,2,9};
		int t;
		int min;
		
		for(int i = 0; i<a.length; i++)
		{
			    min = i;
			for(int j = i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
				{
					min = j;
;				}
			}
			t =a[i];
			a[i] = a[min];
			a[min] = t;
		}
			for(int i1 =0; i1<a.length; i1++)
			{
				System.out.print(a[i1]+ " ");
			}
			
		
		
	}

}
