package STRING;

public class Convert_String_CharArray {
	public static void main(String[] args) {
		
		String h="I am Living In India";
		
		char[] a =h.toCharArray();
		
		for(int i= 0; i<a.length; i++)
		{
			if(i==5)
			{
			System.out.print(a[i]);
			}
		}
	}

}
