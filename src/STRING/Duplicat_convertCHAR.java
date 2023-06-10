package STRING;

public class Duplicat_convertCHAR {
	
	public static void main(String[] args) 
	{
		String str ="prashant pathak";
		
		char [] b = str.toCharArray();
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i]==b[j])
				{
					System.out.println("Max occering Char are => " +b[i]);
					break;
				}
			}
		}
	}

}
