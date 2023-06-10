package ARRAY;

public class Compare_without_Inbuit_Method {
	
	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5};
		int b[] = {0,1,2,3,4,5};
		
		boolean cs =true;;
		
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					cs=false;
					break;
				}
			}
		}
		else
		{
			cs=false;
		}
		
		
		
		
		
		if(cs==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays not Equal");
		}
	}

}
