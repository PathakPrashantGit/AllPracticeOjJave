package Patterns;

public class NUMERIC6 {

	public static void main(String[] args) 
	{
		for(int a =1; a<=5; a++)
		{
			int no = a;
			for(int j=1; j<=a; j++)
			{
				System.out.print(no+" ");
				no = no+5-j;
			}
			System.out.println();
		}

	}

}
