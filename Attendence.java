package conditionsstatements;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes held");
		int nch= sc.nextInt();
		System.out.println("Enter number of classes attended");
		int nca = sc.nextInt();
		
		
		checkAttendence(nch,nca);
	}
	public static void checkAttendence(int nch, int nca) {
		float percent=((nca*100)/nch);
		if (percent<75) {
			System.out.println("Student is not eligible to attend");
		} 
		else {
			System.out.println("Student is eligible to attend");
		}
		
		
		
	}
}
