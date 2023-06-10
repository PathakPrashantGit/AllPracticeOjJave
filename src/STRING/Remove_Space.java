package STRING;

public class Remove_Space {
	
	public static void main(String [] args)
	{
		String k ="P R A S H A N T";
		
		String a =k.replaceAll("(\\s)", "");
		
		System.out.println(a);
	}

}
