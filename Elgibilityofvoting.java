package conditionsstatements;

import java.util.Scanner;

public class Elgibilityofvoting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		checkEligibility(age);
		

	}
	public static void checkEligibility(int age) {
		if (age > 0) {
			if (age >=18)
				System.out.println("Eligible to vote ");
			else 
				System.out.println("not eligible to vote");
		}
		else {
			System.out.println("Enter valid age");
		}
	}

}
