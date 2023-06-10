package ARRAY;

public class count {
	
	public static void main (String [] args) {
	
	String [] a = {"nagpur","banglor","pune","patna","chennai"};
	int count =1;
	String t = a[3];
	
	for(int i =0; i<a.length; i++)
	{
//		count = count+1;
		if(a[i]==t)
		{
			count = count+1;
			System.out.println("index of patnais => "+count);
			break;
		}
		
	}
	
	
	}
}
