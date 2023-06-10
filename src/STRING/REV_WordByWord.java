package STRING;

public class REV_WordByWord {
	

	
	public static void main (String [] args)
	{
		String str = "we  are  learning  String";
		// Result = String learning are we
	 
	 
		
		String [] arr = str.split(" ");
		
		for(int i =arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}
				
	}

}
