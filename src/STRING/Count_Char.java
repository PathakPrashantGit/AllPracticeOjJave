package STRING;

public class Count_Char {
	
	public static void main(String[] args) {
		String h ="I Live in the Bangalore city";
		
		String r = h.replace(" ", "");
		
		int len = r.length();
		
		System.out.println(len);
	}

}
