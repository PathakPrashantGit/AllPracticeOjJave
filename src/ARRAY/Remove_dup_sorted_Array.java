package ARRAY;

public class Remove_dup_sorted_Array {
	
	public static void main(String[] args) {
		
		// remover Duplicated Element in Sorted Array
		int a [] = {2,2,4,4,5,7,7,7,8,9,9,9};
		int j =0;
		for(int i =0; i<a.length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j] =a[i];
				j++;
			}
		}
		
		a[j] =a[a.length-1];
		for(int k =0; k<=j; k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
