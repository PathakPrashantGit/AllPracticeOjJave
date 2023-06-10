package ARRAY;

import java.util.Arrays;

public class CompareTwoArrays {
	
	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5};
		int b[] = {0,1,2,3,4,5};
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Both arrys are Equal");
		}
		else
		{
			System.out.println("Both array are not equal");
		}
	}

}
