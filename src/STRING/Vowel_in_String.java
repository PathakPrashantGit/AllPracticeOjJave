package STRING;

public class Vowel_in_String {
	
	public static void main(String[] args) {
		
		String h = "TrAy";
		int count = 0;
		for(int i = 0; i<h.length();i++)
		{
			char k = h.charAt(i);
			if(k== 'a'|| k=='e'||k=='i' || k=='o' || k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U')
			{
				count = count+1;
			}
		}
		if(count!=0)
		{
			System.out.println("vowel is present in the String  "+count);
		}
		else
		{
			System.out.println("not vowel");
		}
	
	
	}

}
