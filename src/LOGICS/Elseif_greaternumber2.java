package LOGICS;

public class Elseif_greaternumber2 {
	public static void main (String []args) {
		
		int a= 700;
		int b= 80;
		int c= 900;
		
		if (a>b) // true
		{
			System.out.println("a is greater than b");
		}
		else // that will not print because the if condition is true
		{
			System.out.println("b is greater than a");
		}
		if (b>c) // statement is false
		{
			System.out.println("b is greater than c");
		}
		else // then the statement else is true then that will print the else statement
		{
			System.out.println("c is greater than b");
		}
		if (a<c) // statement is true then that will be printed
		{
			System.out.println("a is greater than c");
		}
		else //statement is false
		{
			System.out.println("c is greater than a");
		}
		
		
		
		
		
		
		
		
	}

}
