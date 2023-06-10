package LOGICS;

public class Fabnocci {
	// fabnocci 0 1 1 2 3 5 8 
	public static void main (String[] args) {
	int a = 0;
	int b = 1;
	int c;
	
	for(int i = 0; i<=10; i++)  // i 1 2 3
	{
		c = a+b; //1 2 3 5
		System.out.println(a);
		a = b; // a =1 1 2 3
		b = c; // b =1 2 3 5
	}
	} 
	//c 1 2 3 5
}
