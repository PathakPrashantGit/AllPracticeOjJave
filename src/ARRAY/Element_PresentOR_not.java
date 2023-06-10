package ARRAY;

public class Element_PresentOR_not {

public static void main(String[] args) {
		
		int a[] = {45,12,87,92,99,45,99,10,100,0,-45};
		
		int serch = 10;
		boolean found = false;
		for(int i=0; i<a.length; i++)
		{
			if(serch==a[i])
			{
				found =true;
			}
		}
		if(found==true)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Element not present");
		}
		
}
}
