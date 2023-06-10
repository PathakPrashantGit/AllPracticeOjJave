package STRING;

public class CapLocks_Count {
	public static void main(String[] args) {
		
		String h = "HeLLo Java world 35454 !@#$%^&";
		int size = h.length();
		int upper =0;
		int lower =0;
		int number =0;
		int specialchar =0;
		
		for(int i =0; i<h.length(); i++)
		{
			if(h.charAt(i)>='A' && h.charAt(i)<='Z')
			{
				upper++;
			}
			else if(h.charAt(i)>='a' && h.charAt(i)<='z')
			{
				lower++;
			}
			else if(h.charAt(i)>='0' && h.charAt(i)<='9')
			{
				number++;
			}
			else if (h.charAt(i)!=' ')
			{
				specialchar++;
			}
		}
		System.out.println("upper => "+upper);
		System.out.println("Lower => "+lower);
		System.out.println("Number => "+number);
		System.out.println("Special char => "+specialchar);
		
		double lowerper = (upper*100)/size;
		System.out.println("lowerper => "+lowerper);
	}

}
