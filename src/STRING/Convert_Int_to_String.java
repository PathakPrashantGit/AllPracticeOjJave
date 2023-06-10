package STRING;

public class Convert_Int_to_String {
	
	public static void main(String[] args) {
		int a =456;
		 
		String h = Integer.toString(a);
		
		System.out.println(h.length());
		System.out.println(h.charAt(2));
		
		// rever the number by converting the integer to string
		
		for(int i= h.length()-1; i>=0;i--)
		{
			System.out.print(h.charAt(i));
		}
	}

}
