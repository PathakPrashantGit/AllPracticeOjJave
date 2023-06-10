package STRING;

import java.util.HashSet;
import java.util.Set;

public class HashTag_Duplicate {
public static void main(String[] args) {
		//Time Complexity is o(n)
		String name[] = {"java","javaScript","Ruby","c","java"};
		// using Hasgset java Collection = it Store the unique value
		
		Set<String> obj = new HashSet<String>();
		// Set = Interface
		// HashSet = Class
		
		for(String names:name)
		{
			if(obj.add(names)==false)
			{
				System.out.println("Duplicate String is==== "+names);
			}
		}
		
		
		
	}
}
