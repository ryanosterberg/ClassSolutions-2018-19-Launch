package decisionStructures;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("How many years of experience do you have?");
		double years = input.nextDouble();
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();

		if (age >= 50 || age < 50 && height < 70 || height > 80 && Math.abs(years - 10.5) < 0.0000001) {
			System.out.println("You get a promotion");
		} else {
			System.out.println("You don't get a promotion");
		}
	}

}
