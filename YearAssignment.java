package conditionsstatements;

import java.util.Scanner;

public class YearAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year= sc.nextInt();
		System.out.println(findLeaporNot(year));

	}

	public static String findLeaporNot(int year) {
		if (year%400==0 || (year%4==0&&year%100!=0)) {
			return "Leap year";
		}
		return "Not a leap year";
	}

}
