package STRING;

public class Remove_DuplicateChar {
	public static void main(String[] args) {
		String p = "Prashant Pathak";
		char ch []=p.toCharArray();
		char t =' ';
		
		for(int i =0; i<ch.length; i++)
		{
			for(int j =i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i] =t;
				}
			}
			
		}
	for(int i =0; i<ch.length; i++)
	{
		System.out.print(ch[i]+" ");
	}
		
	}

}
