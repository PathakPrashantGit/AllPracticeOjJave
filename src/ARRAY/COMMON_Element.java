package ARRAY;

public class COMMON_Element {
	
	public static void main(String[] args) {
	      int [] a = {4,3,7,9,8};
	      int [] b = {5,1,4,8,3};
	      
	      for(int i = 0; i<a.length; i++)
	      {
	    	  for(int j =0; j<b.length; j++)
	    	  {
	    		  if(a[i] == b[j]) 
	    		  {
	    			  
	    			  System.out.println(" common Element in booth array are :- " +a[i]);
	    			 
	    		  }
	    	  
	    	  }
	      }
	}

}
