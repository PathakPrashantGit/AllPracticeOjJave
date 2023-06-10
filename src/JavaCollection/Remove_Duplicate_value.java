package JavaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_value {
	public static void main(String[] args) {
		
	
	
	int a[] = {4,5,9,8,4,3,6,6,8,5,4};
	 Set<Integer> st =  new HashSet<Integer>();
	 
	 for(int i =0; i<a.length; i++)
	 {
		 st.add(a[i]);
	 }
	 
	 // now conver the set into Array
	 
	 Integer [] b =st.toArray(new Integer[st.size()]);
	 System.out.println(Arrays.toString(b));
	
	
	}
}
