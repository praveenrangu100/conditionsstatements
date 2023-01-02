package conditionsstatements;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int  number = sc.nextInt();
		System.out.println(checkEvenornot(number));
	}
	public static String checkEvenornot(int number) {
		if (number%2==0)
			return "it is even";
		return "not even";
			
		
	}

}
