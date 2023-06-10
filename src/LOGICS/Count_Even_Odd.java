package LOGICS;

public class Count_Even_Odd {
	
public static void main(String[] args) {
		
		int a=4581693;
		
		int even=0;
		int odd =0;
		int rem;
		while(a>0)
		{
			rem = a%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			a=a/10;
		}
		System.out.println("Total Number of Even Numbers Are =>"+even);
		System.out.println("Total Number of odd Numbers Are =>"+odd);

	 
}

}
