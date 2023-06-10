package LOGICS;

public class Armstrong {
	
	public static void main(String[] args)
	{
		 // Armstrong numbers are 1, 153,370
		// 153 = 1*1*1 + 5*5*5 + 3*3*3
		
		int a = 370;
		int i =a;
		int r = 0;
		int sum = 0;
		while(a>0)
		{
			r = a%10;
			a = a/10;
			sum = sum + r*r*r;
		
		}
		if(sum==i)
		{
			System.out.println(" this is Armstrong number");
		}
		else
		{
			System.out.println("this is not armstrong number");
		}
		
		
		
	}

}
