package reviewAfterBreak;

import java.util.Random;

public class Review3PartOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random(5);
		double even = 0;
		int min = 1;
		int max = 17;
		int counter = 0;
		int[] Students = new int[1340];

		for (int j = 0; j < Students.length; j++) {
			Students[j] = min + generator.nextInt(max - min + 1);
		}

		for (int i = 1339; i > 0; i--) {
			if (Students[i] > 7) {
				//System.out.println(Students[i]);
				counter++;
			}
		}

		for (int i = 0; i < Students.length; i++) {
			if (Students[i] % 2 == 0) {
				even++;

			}
		}
		//System.out.println(counter);
		System.out.println((even / 1340) * 100 + "%");

	}

}
