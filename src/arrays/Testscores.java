package arrays;

import java.util.Scanner;

public class Testscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int[] scores = new int[9];
		for (int j = 0;j<scores.length;j++) {
			System.out.println("Enter scores inside");
			scores[j] = input.nextInt();
		}
		int maxValue = scores[0];
		int minValue = scores[0];
		int sums = 0;
		
		  for(int i=1;i < scores.length;i++) {
		    if(scores[i] > maxValue){
			  maxValue = scores[i];
		    }
			  if(scores[i] < minValue){
				  minValue = scores[i];
			  }
			  sums = sums + scores[i];
		  }
		 System.out.println("Higher score is " + maxValue);
		 System.out.println("Lowest score is " + minValue);
		 System.out.println("Average score is " + sums/scores.length);
		for(int j = 0; j < scores.length; j++) {
				System.out.println(scores[j]);
			}
	}
}