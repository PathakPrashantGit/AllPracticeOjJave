package ARRAY;

public class Prime_in_Array {
	
	public static void main(String[] args) {
int a[] = {2,5,6,8,9,3,1,7,5,10};
		
		for(int i=0; i<a.length; i++)
		{
			int count =0;
			for(int j=2; j<a[i]-1; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
			 System.out.println(a[i]+"  is prime");
			}
			else
			{
				System.out.println(a[i]+ " is not prime");
			}
		}
		
	}

}
