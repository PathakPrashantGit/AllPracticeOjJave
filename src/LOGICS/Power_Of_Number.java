package LOGICS;

import java.util.Scanner;

public class Power_Of_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println("Enter the power ");
		int power = sc.nextInt();
		sc.close();
		int sum =1;
		for(int i =1; i<=power; i++)
		{
			sum = sum*num;
		}
		System.out.println(num+" to the "+power+" is => "+sum);
	}

}
