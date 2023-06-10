package Patterns;

public class Star_005 {
	public static void main(String[] args) {
		for(int a=1; a<=5;a++)
		{
			for(int i =1; i<=a; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int a =1; a<=5; a++)
		{
			for(int i =5; i>a; i--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
