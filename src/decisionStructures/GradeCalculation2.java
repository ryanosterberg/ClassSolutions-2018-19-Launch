package decisionStructures;

import java.util.Scanner;

public class GradeCalculation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double TestAverage = 1;
		double HomeworkAverage = 1;
		boolean Teacher = false;
		Scanner input = new Scanner(System.in);
		System.out.println("What is keine TestAverage?");
		TestAverage = input.nextDouble();
		System.out.println("Was ist keine HomeworkAverage?");
		HomeworkAverage = input.nextDouble();
		System.out.println("Ist deine lehrer nice? true or false answer!");
		Teacher = input.nextBoolean();
		
		if (Teacher == true)
		{
			if(HomeworkAverage>TestAverage) {
				System.out.println("Your final score ist " + HomeworkAverage);
			}
			else {
				System.out.println("Your final score ist " + TestAverage);
				}
		}
		else
			{
			if(HomeworkAverage<TestAverage) {
				System.out.println("You suck, your final score ist " + HomeworkAverage);
				}
			else
			{
				System.out.println("YOU SUCK, your final score ist " + TestAverage);
			}
		}
		
	}

}
