package LOGICS;

public class Number_of_Digit {
	public static void main(String[] args) {
		int r = 12345;
		int count = 0;
		while(r!=0)
		{
			
			r = r/10;
			++count; 
		}
		System.out.println(count);
		
			}

}
