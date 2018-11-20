package input;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = -999;
		int no2 = -999;
		int no3 = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a 1 digit number");
		no1 = input.nextInt();
		System.out.println("Give me a 1 digit number");
		no2 = input.nextInt();
		System.out.println("Give me a 1 digit number");
		no3 = input.nextInt();
		System.out.println(no1+""+no2+no3);
		System.out.println(no1+""+no3+no2);
		System.out.println(no2+""+no1+no3);
		System.out.println(no2+""+no3+no1);
		System.out.println(no3+""+no2+no1);
		System.out.println(no3+""+no1+no2);
	}

}
