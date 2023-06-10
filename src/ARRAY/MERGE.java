package ARRAY;

public class MERGE {
	
	public static void main(String[] args) 
	{
		int [] a = {1,2,3};
		
		int []b = {4,5,6,7,8,9};
		// now we have to merge both array a and b lets take int array C
		
		int a_len = a.length; // length = 3
		int b_len = b.length; // length = 6
		int c_len = a_len + b_len; // length = 9
		
		int [] c = new int [c_len]; 
		
		for(int i = 0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i =0; i<b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		for (int i =0; i<c.length; i++)
		{
			System.out.print(c[i]+ " ");
		}
		
		
	}

}
