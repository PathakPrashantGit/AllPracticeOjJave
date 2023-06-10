package LOGICS;

public class conditional {
	
	public static void main (String [] args) {
		
	//fees for institute should be equal to 20000 or less
    //there will be 2 installment that should be equal to 10000
	// there should not emi cost
		
		int fees = 30000;
		int installment = 10000;
		boolean EMI = true;
		
		if (fees<=20000) // false
		{
			System.out.println("fees should be suitable");
			
			if(installment<=9000) // false
			{
				System.out.println("Check the installment criteria");
				if (EMI== true)
				{
					System.out.println("Lets take the addmission in the institution");
				}
				else
				{
					System.out.println(" you cant take admission");
				}
				
			}
			else
			{
				System.out.println(" sorry for installment you are not eligible");
			}
		}
		else
		{
			System.out.println(" fees not suitable for you");
		}
	}
	
	

}
