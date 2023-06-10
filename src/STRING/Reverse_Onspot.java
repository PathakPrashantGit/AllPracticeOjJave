package STRING;

public class Reverse_Onspot {
	
	public static void main(String[] args) {
		String str ="Mr Prashant Pathak";
		
		String[] words = str.split(" ");
		
		String reversestr ="";
		for(String word : words)
		{
			String reverseWord ="";
			for(int i=word.length()-1; i>=0; i--)
			{
				reverseWord = reverseWord + word.charAt(i);
			}
			reversestr = reversestr + reverseWord+" ";
		}
		System.out.println(reversestr+" ");
	}

}
