package mathOperators;

import java.util.Scanner;

public class LongDivision {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int dividend = input.nextInt();
	int divisor= input.nextInt();
	int answer = dividend/divisor;
	int remander = dividend % divisor; 
	System.out.println(answer+ "r"+ remander );

}
}