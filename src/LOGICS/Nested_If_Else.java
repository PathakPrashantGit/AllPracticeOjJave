package LOGICS ;

public class Nested_If_Else {
	
	public static void main(String[] args) {
		int a =7258;
		int b =780; 
		int c =780;
		
		if(a>=b)
		{
			if(a>=c)
			{
				if(a==c)
				{
					System.out.println("A is equal to c");
				}
				else if(a==b)
				{
					System.out.println("a is equal to b");
				}
				else 
				{
				System.out.println("a is greater number");
				}
			}
			else
			{
				System.out.println("c is greater number");
			}
		}else if (a<=b)
		{
			if(a<=b)
			{
				if(a==b)
				{
					System.out.println("a is equal to b");
				}
				else if(b==c)
				{
					System.out.println("b is equal to c");
				}
				else {
				System.out.println("b is greater number");
				}
			}
			else
			{
				if(b==c)
				{
					System.out.println("c is equal to b");
				}
				else {
				System.out.println("c is greater number");
				}
			}
		}
	}

}





