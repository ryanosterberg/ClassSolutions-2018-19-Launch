package loops;

import java.util.Scanner;

public class CubeANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number:");
		num = input.nextInt();
		while (num != -1) {
			System.out.println("Number cubed: "+ num*num*num);
			System.out.println("Enter another number (-1 to quit):");
			num = input.nextInt();
		}
		input.close();
	}

}
