package conditionsstatements;

import java.util.Scanner;

public class Largestoftwonums {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		System.out.println(findGreaternum(a , b));

	}
	public static String findGreaternum(int a, int b) {
		String greater= a>b?a+" a is greater":b +"b is greater";
		
		return greater ;
	}
}
