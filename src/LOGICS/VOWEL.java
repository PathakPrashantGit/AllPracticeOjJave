package LOGICS;



public class VOWEL {
	public void nest(char val)
	{
		if(val =='a' || val=='e' ||  val =='i' ||  val == 'o' ||  val == 'u')
		{
			System.out.println(val+ " :-is vowel");
		}
		else
		{
			System.out.println(val+" :-is consonant");
		}
	}
	
	public static void main (String[] args)
	{
		VOWEL obj = new VOWEL();
		obj.nest('f');
	}
}
