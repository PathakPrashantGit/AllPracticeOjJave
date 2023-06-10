package Patterns;

public class Reverse_Pyramid {
	public static void main(String[] args) {
		  for(int a =0; a<=5;a++)
		  {
			  for(int i = 0; i<=a; i++)
			  {
				  System.out.print(" ");
			  }
			  for(int j=4; j>=a; j--)
			  {
				  System.out.print("*");
			  }
			 for(int k = 4; k>a; k--)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		  }
	}
}
