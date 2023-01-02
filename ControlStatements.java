package conditionsstatements;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= sc.nextInt();
		System.out.println(checkNumber(number));

	}
	public static String checkNumber(int number) {
		if (number >=0)
			return "Positive number";
		return "Not a positive number";
	}

}
