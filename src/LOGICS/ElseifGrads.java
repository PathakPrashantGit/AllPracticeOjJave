package LOGICS;

public class ElseifGrads {
	public static void main (String []args) {
		//100 =marks >=90 A+
		//90 > marks>=80 A
		//80>marks>=70 B+
		//70>marks>=60 B
		//60>marks>=50 C
		//50 > marks>=40 D
		// marks<40 Fail
		
		int marks = 72;
		
		if (marks<=100 || marks >= 0) 
		{
			if (marks>=90)
			{
				System.out.println("you obtained grade A+");
				
			}
			else if (marks>=80)
			{
				System.out.println("you obtained grade A");
			}
			else if (marks >= 70)
			{
				System.out.println("you obtained grade B+");
				
			}
	     else if (marks>=60)
	     {
	    	 System.out.println("you have obtained grade B");
	     }
	     else if (marks >= 50)
	     {
	    	 System.out.println(" you have obtained grade c");
	     }
	     else if (marks>=40)
	     {
	    	 System.out.println("you have obtained grade D");
	     }
	     else if (marks<=40)
	     {
	    	 System.out.println(" sorry you are fail");
	     }
		}
		
		else 
		{
			System.out.println("you entered the wrong number");
		}
		
		
		
		
		
		
	}

}
