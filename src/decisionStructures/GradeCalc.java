package decisionStructures;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Grade Calculation
		Scanner input = new Scanner(System.in);
		System.out.println("What is your average test grade?");
		double test = input.nextDouble();
		System.out.println("What is your homework average?");
		double homework = input.nextDouble();
		System.out.println("true or false: Your teacher nice?");
		boolean nice = input.nextBoolean();
		if (nice == true) {
			if (test > homework) {
				System.out.println("You have a grade of " + test + "%");
			} else {
				System.out.println("You have a grade of " + homework + "%");
			}
		} else {
			if (test < homework) {
				System.out.println("You have a grade of " + test + "%");
			} else {
				System.out.println("You have a grade of " + homework + "%");
			}
		}
	}

}
