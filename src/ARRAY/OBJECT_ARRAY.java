package ARRAY;

public class OBJECT_ARRAY {
	public static void main(String[] args) {
		
	
	
	// BY CREATING OBJECT ARRAY WE CAN STORE MULTIPLE DATATYPE IN ONE ARRAY
	 
	Object ob [] = new Object[5]; // Object is a class (Supermost class) so 'O' will be in capital letter
      ob [0] = 100;           // Int
      ob [1] = "Prashant";   // String
      ob [2] = '&';         // char
      ob[3] = 33.56;       // double
      ob[4] = true;       // Boolean
      
      for(int i =0; i<ob.length; i++)
      {
    	  System.out.print(ob[i]+ " ");
      }
      
      
      
	}
}
