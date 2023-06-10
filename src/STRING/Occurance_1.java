package STRING;

public class Occurance_1 {
	
	public static void main(String[] args) {
		String k ="Raghvendra Pathak";
		
		int a = k.length();
		
		String str1 =k.replace("a","");
		 int b = str1.length();
		 
		 System.out.println("a occured Numbers of Time => " +(a-b));
	}

}
