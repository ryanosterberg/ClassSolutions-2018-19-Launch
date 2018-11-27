package randomNumbers;

import java.util.Random;

import java.util.Scanner;

public class BigCoin {
	public static void main(String[] args) {
		Random random = new Random();
		int s = 0;
		int l = 0;
		int totalH = 0;
		int totalS = 9999;
		int min = 1;
		int max = 2;
		
		for (int i = 0; i < 1000000; i++) {
			totalH = 0;
			totalS = 0;
			for (int x = 0; x <= 100000; x++) {
				int randomNum = min + random.nextInt(max - min + 1);
				if (randomNum == 1) {
					totalH++;

				}
				if (randomNum == 2) {
					totalS++;

				}
			}
			if (totalH > l) {
				l = totalH;
			}
			if (totalS < totalS) {
				s = totalS;
			}

		}

		System.out.println("The most amount of heads is " + ((l / 100000) * 100));

	}
}
