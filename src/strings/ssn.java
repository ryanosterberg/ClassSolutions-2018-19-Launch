package strings;

import java.util.Scanner;

public class ssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Give me your SSN please :smile:");

		String ssn = input.nextLine();

		System.out.print(ssn.charAt(0));

		System.out.print(ssn.charAt(1));

		System.out.print(ssn.charAt(2) + "-");

		System.out.print(ssn.charAt(3));

		System.out.print(ssn.charAt(4) + "-");

		System.out.print(ssn.charAt(5));

		System.out.print(ssn.charAt(6));

		System.out.print(ssn.charAt(7));

		System.out.print(ssn.charAt(8));
	}

}
