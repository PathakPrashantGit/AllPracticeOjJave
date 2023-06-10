package STRING;

public class Remove {
	public static void main(String[] args) {
		
	
	String h = "#$^*%^$Learn%^& Java=%46 Language"; // Remove the Junk charracter from String
	// Here we use the Regular Expresion
	// Regular Expressions are = [^a-zA-Z0-9]
	//here we use the ReplaceAll method of String class
	System.out.println(h.replaceAll("[^a-zA-Z0-9 ]", ""));
	System.out.println(h.replaceAll("[^a-zA-Z ]", ""));

	}
}
