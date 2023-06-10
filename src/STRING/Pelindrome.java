package STRING;

public class Pelindrome {
	
	public static void main (String [] args)
	{
		String h = "PKP";
		
		String rev = "";
		for(int i = h.length()-1; i>=0; i--)
		{
			rev = rev+h.charAt(i);
		}
		if (h.equals(rev))
		{
			System.out.println("This string is pellindrome :- " +h);
		}
		else
		{
			System.out.println("This string is not pellindrome :- " +h);
		}
		
		}
		
	}


