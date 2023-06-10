package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
	
	public static void main(String[] args) {
		String a[] = {"Java","Python","Selenium","Appium"};
		
		ArrayList<String> alist = new ArrayList<String>();
		
		for(String temp : a)
		{
			alist.add(temp);
		}
		System.out.println(alist);
		
		System.out.println("=================================================");
		
		List list = Arrays.asList(a);
		System.out.println(list);
	  
		System.out.println("======================================================");
		
		ArrayList<String> alist1 = new ArrayList<String>();
		Collections.addAll(alist1, a);
		System.out.println(alist1);
				
	}

}
