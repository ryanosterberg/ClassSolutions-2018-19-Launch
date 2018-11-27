package randomNumbers;

import java.util.Random;

import java.util.Scanner;

public class RollDiceTwo {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		FindP p = new FindP();
		int min = 1;
		int max = 6;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		double six = 0;
		System.out.println("how many times do you want to roll");
		int roll = input.nextInt();
		for (int i = 0; i <= roll; i++) {
			int randomNum = min + random.nextInt(max - min + 1);
			if(randomNum == 1) {
				one++;
			}
			if(randomNum == 2) {
				two++;
			}
			if(randomNum == 3 ) {
				three++;
			}
			if(randomNum == 4) {
				four++;
			}
			if(randomNum == 5) {
				five++;
			}
			if(randomNum == 6 ) {
				six++;
			}
		}
		//I made a class that divides the two numbers and multiples by 100 to get percent
		System.out.println("1 "+one);
		System.out.println(p.Percent(one, roll));
		System.out.println("2 "+two);
		System.out.println(p.Percent(two, roll));
		System.out.println("3 "+three);
		System.out.println(p.Percent(three, roll));
		System.out.println("4 "+four);
		System.out.println(p.Percent(four, roll));
		System.out.println("5 "+five);
		System.out.println(p.Percent(five, roll));
		System.out.println("6 "+six);
		System.out.println(p.Percent(six, roll));
	}
}
