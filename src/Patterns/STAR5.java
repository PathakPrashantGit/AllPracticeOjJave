package Patterns;

public class STAR5 {
	public static void main(String[] args)
	{
		for(int a=1; a<=5; a++) //a=2 a =3
		{
			for (int j =1; j<=a; j++)// j = 1 1<=3 true  j=2 2<=3 true j =3 3<=3 true
			{
				
				if(a>=2 && j<=a-1 ) // 3>=2 true && 3<=3-1 false
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
