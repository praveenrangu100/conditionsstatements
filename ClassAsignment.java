package conditionsstatements;

import java.util.Scanner;

public class ClassAsignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject marks");
		float a = sc.nextFloat();
		System.out.println("Enter second subject marks");
		float b = sc.nextFloat();
		System.out.println("Enter third subject marks");
		float c = sc.nextFloat();
		gradetheSubjects(a,b,c);

	}
	public static  void gradetheSubjects(float a, float b, float c) {
		float percent= (a+b+c)/3;
		if (percent >= 90) {
			System.out.println("the grade is A");
		}
		else if (percent>=70 && percent<90) {
			System.out.println("the grade is B");
		}
		else if (percent >=50 && percent<70) {
			System.out.println("the grade id C");
		}
		else {
			System.out.println("the grade is F");
		}
	}

}
