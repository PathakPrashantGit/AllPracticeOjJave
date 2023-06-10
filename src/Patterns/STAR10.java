package Patterns;

public class STAR10 
{
   public static void main (String[] args)
   {
	   for(int a=1; a<=4; a++)
	   {
		   for(int j = 1; j<=4; j++)
		   {
			 if (a>=2 && j>=2 && a<=3 && j<=3)
			 {
				 System.out.print("  ");
			 }
			 else
			 {
			      System.out.print(" *");
			 }
		   }
		   System.out.println();
	   }
   }
}
