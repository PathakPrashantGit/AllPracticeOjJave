package STRING;

public class New_Concept_2 {
	
	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(x+y+a+b);// Ans=> HelloWorld100200
		System.out.println(a+b+x+y); // Ans => 300HelloWorld
		System.out.println(x+y+(a+b)); // Ans => HelloWorld300
	}

}
