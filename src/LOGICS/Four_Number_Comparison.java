package LOGICS;

public class Four_Number_Comparison {
	
	public static void main(String[] args) {
		
		int a = 10863716;
		int b =45345;
		int c =780;
		int d = 98;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("A is greater then");
		}
		else if (b>c && b>d)
		{
			System.out.println("B is greater then");
		}
		else if(c>d)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("D is greater");
		}
	}

}
