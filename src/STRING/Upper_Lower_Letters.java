package STRING;

public class Upper_Lower_Letters {
	
	public static void main(String[] args) {
		
		String s ="I Love My India";
		
		int upper =0;
		int lower =0;
		
		for(int i =0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println("Upper leters are =>" +upper);
		System.out.println("Lower Letyers are =>"+lower);
	}
	

}
