package ARRAY;

public class REV_INSIDE_WORD {
	public static void main(String[] args) {
		
		
		   String [] a = {"Prashant","Rahul","Akshay","Ankush","Akshay","Akshay","Pathak","Akshay"};
		   String b = a[0];
		   
		   for(int i = a.length-1; i>=0;i--)
		   {
			  if(a[i]==b)
			  {
				  String k =a[i];
				  for(int j =k.length()-1; j>=0; j--)
				  {
					  System.out.print(k.charAt(j));
				  }
			  }
		   }
		   
			}
}
