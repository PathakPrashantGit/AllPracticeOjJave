package ARRAY;

public class MINIMUM {
	public static void main (String[] args) {
	int a [] = {5,6,8,9,3,1,3};
	int min = a[0];
	
	for(int i = 0; i<a.length; i++)
	{
		if(min>a[i])
		{
			min = a[i];
		}
	}
	System.out.println("minimum number in array is :- " +min);
	
	
	}

}
