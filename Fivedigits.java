package conditionsstatements;

import java.util.Scanner;

public class Fivedigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		checkNumber(number);
	}

	public static String checkNumber(int number) {
		if (number>9999) {
			if (number<100000) 
			System.out.println("It is five digit number");
			else
				System.out.println("the number have more than 5 digit");
		}
		else {
			System.out.println("entered number not have 5 digits");
		}return null;
	}

}
