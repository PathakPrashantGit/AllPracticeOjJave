package ARRAY;

public class INSERTION {
	
	public static void main(String[] args)
	{
		// insert the value in the array
		int a [] = {10,20,40,50,60};
		
		int poss = 3;
		int element = 30;
		
		for(int i = a.length-1; i>poss-1; i--)
		{
			a[i] = a[i-1];// {10,20,40,40,50}
		}
		a[poss-1] = 30; //{10,20,30,40,50}
		for(int i = 0; i<=a.length-1; i++) {
		System.out.print(a[i]+ " ");
		}
	}

}
