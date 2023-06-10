package LOGICS;

public class Perfact_No {
	
	public static void main(String[] args) {
		int k =28;
		// formula = 28 = 1+2+4+7+14 (in All these numbers 28 comes in these number's Table)
		
		int count =0;
		
		
		for(int i =1; i<k;i++)
		{
			if(k%i==0)
			{
				count =count+i;
			}
		}
		if(count==k)
		{
			System.out.println("Number is perfect number");
		}
		else
		{
			System.out.println("Number is not perfect Number");
		}
		
	}

}
