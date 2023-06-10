package STRING;

public class Convert_String_to_Integer {
	
	/*convert the String into the Integer	
     * when number is in double qutation like"100" then we can convert it into Integer
     * BUT number like "100ABC" then you can't convert the string into the integer
     * it will give you NimberFormatException
     */
	
	public static void main(String[] args) {
		String j ="100";
		//convert String into the Integer
		
		int a= Integer.parseInt(j);
		System.out.println(a+100);
	}

}
