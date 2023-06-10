package STRING;

public class DUPLICATE {
       public static void main (String[] atgs)
       {
    	   
    	   // Time coplexity is o(n*n)
    	   String h = "Prashantat";
    	   System.out.print(" Duplicate Characters :- ");
    	   
    	   for ( int i = 0; i<h.length(); i++)
    	   {
    		   for(int j = i+1; j<h.length(); j++)
    		   {
    			   if(h.charAt(i)==h.charAt(j) )
    			   {
    				   System.out.print( h.charAt(i) +" ");
    			   }
    		   }
    	   }
    	   
       }
}
