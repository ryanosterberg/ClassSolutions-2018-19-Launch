package input;
import java.util.Scanner;
public class AgeAnswer {



public static void main(String[] args) {
	int age = -999;
	double weight = -999.0;
	Scanner input = new Scanner(System.in);
	System.out.println("How old are you?");
	age = input.nextInt();
	System.out.println("How much do you weigh?");
	weight = input.nextDouble();
	System.out.println("You are "+age+" years old! You weigh "+weight+" pounds!");
	input.close();
}
}


