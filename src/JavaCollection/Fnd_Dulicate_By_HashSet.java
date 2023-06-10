package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class Fnd_Dulicate_By_HashSet {
	public static void main(String[] args) {
		int a[] = {4,3,5,3,6,9,4,6};
		System.out.println("Duplicate Elements Are => ");
		Set<Integer> st = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			if(st.add(a[i])==false)
			{
				System.out.println(a[i]);
			}
		}
	}

}
