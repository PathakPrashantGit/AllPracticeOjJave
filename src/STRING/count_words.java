package STRING;

public class count_words {
	
	public static void main (String [] args)
	{
		String s ="I am living in the Bangalore city"; 
		int count = 1; // I have to count no of words in stringthats why i have taken count as INT
		               //  (int count = 1 because starting char is not SPACE)
		
		for(int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')//
			{
				count++;
			}
		}
		System.out.println("No of words in String are -: " +count);
		
		
		
		
	}

}
