package conditionsstatements;

import java.util.Scanner;

public class Largernumthree {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		System.out.println(checkLargernum(a , b , c));
	}
	public static String checkLargernum(int a, int b, int c) {
		int larger= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		
		return "the larger number is "+ larger;
	}

}
