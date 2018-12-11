package arrays;

import java.util.Scanner;

public class sumofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 0;
		double e = 0.0;
		double[] scores = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter your test scores");
			scores[i] = input.nextDouble();
		}
		for (int j = 0; j < 5; j++) {
			e = e + scores[j];
		}
		System.out.println(e);
	}

}
