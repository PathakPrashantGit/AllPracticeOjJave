package STRING;

public class Occurance_2 {
	
	public static void main(String[] args) {
		String k ="ananya Pathak";
		
		//conver the String into charArray
		
		char[] a = k.toCharArray();
		int count = 0;
		for(int i=0;i<a.length; i++)
		{
			if('a'==a[i])
			{
				
				count++;
			}
		}
		
		System.out.println("a occured numbers of Times => "+count);
	}

}
