package JavaCollection;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int a[] = {4,5,8,6,3,9,6,4,5,2,1,0};
		
		System.out.println("Before sorting =>" + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("After sort =>" +Arrays.toString(a));
	}

}
