package STRING;

public class Reverseonsamespot {

	public static void main(String[] args) {
		String str="My name is Raghvendra Pathak";
		String [] newstr=str.split(" ");
		
		String reversestr="";
		for(String word:newstr) {
			String reverseWord ="";
			for(int i=word.length()-1; i>=0; i--) {
				reverseWord=reverseWord+word.charAt(i);
			}reversestr = reversestr + reverseWord+" ";
		}System.out.println(reversestr+" ");
		
	}

}
