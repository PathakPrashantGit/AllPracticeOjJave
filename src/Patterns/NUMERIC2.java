package Patterns;

public class NUMERIC2 {

	public static void main(String[] args)
	{
		int count = 0;
		for(int a= 1; a<=4; a++)
		{
			for(int j= 1; j<=a; j++)
			{
				count = count+1;
				
					System.out.print(count+" ");
//				System.out.print(a);
				
			}
			System.out.println();
		}

	}

}
