package ARRAY;

public class Direct_Insertion {
	

	public static void main(String[] args) {
		
	
    int [] a = {40,56,20,35,90};
    int position = 3;
    int insert =30;
     for(int i =0; i<position;i++)
     {
    	if(i==position-1)
    	{
    		a[i] =30;
    	}
     }
     for(int i =0; i<a.length;i++)
     {
    	 System.out.print(a[i]+" ");
     }
    
    
}

}
