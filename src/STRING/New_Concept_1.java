package STRING;

public class New_Concept_1 {
	public static void main(String[] args) { 
		String f = "The Rains have started here";
		/*System.out.println(f.length());
		
		System.out.println(f.indexOf('s'));// first occurance of 's'
		System.out.println(f.indexOf('s', f.indexOf('s')+1)); // Second occurence of 's'
		System.out.println(f.indexOf("have"));
		System.out.println(f.indexOf("Hello")); // not give Exception (Ans => -1)
		System.out.println(f.substring(0, 9));*/
		
		String h ="   Angular Motion";
    //System.out.println(h.trim()); // it will only remove after spaces and before spaces
	//System.out.println(h.replace(" ", ""));// remove the spaces between the words	
		
		
		String []a = f.split(" ");
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
