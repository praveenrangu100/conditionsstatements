package conditionsstatements;

import java.util.Scanner;

public class DiscountAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price of item ");
		float price = sc.nextFloat();
		checkDPrice(price);

	}

	public static void checkDPrice(float price) {
		float dis1 = 10, dis2=20, dis3=25;
		if (price>0&&price<=10000) {
			System.out.println("the price is " + (price-(price/dis1)));
		}
		else if (price>10000 && price<20000) {
			System.out.println("the price is " + (price-(price/dis2)));
		}
		else {
			System.out.println("the price is " + (price-(price/dis3)));
		
	}

}
}