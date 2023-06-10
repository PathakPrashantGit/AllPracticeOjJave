package LOGICS;

public class Palindrome { 
	public static void main (String[] args)
	
	// 121
	{
		int a = 1221;
		int b = a;
		int rev = 0;
		int rem;
		while(b!=0)
		{
			rem = b%10;
			rev =rev*10 + rem;
			b = b/10;
			
		}
		if (a==rev)
		{
			System.out.println(a+ " :- Number is pelindrome Number");
		}
		else
		{
			System.out.println(a+ " :- Number is not a pelindrome number");
		}
	}

}
