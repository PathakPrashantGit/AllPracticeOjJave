package ARRAY;

public class Swap_Last_First {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		
		int size = a.length;
		
		int temp = a[0];
		
		a[0] = a[size-1];
		
		a[size-1] = temp;
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
