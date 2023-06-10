package STRING;

public class Max_char {
	
	public static void main (String[] args)
	{
		String s = "PRASHANT PATHAK "; // max occuring char is 'A'
		int [] arr = new int[127]; // define the value of char like a[97] = value is 0
		
		for(int i = 0; i<s.length(); i++)
		{
			arr[s.charAt(i)] = arr[s.charAt(i)]+1; // to strore the each char values
		}
		int max = -1;
		char val = ' ';
        for ( int i = 0; i<s.length(); i++)
        {
        	if(max<arr[s.charAt(i)])
        	{
        		max = arr[s.charAt(i)];
        		val = s.charAt(i);
        	}
        }
        System.out.println("Max occuring char is -: " +val);
		
	}
	
	
	
	
	
	
	
	

}
