package mathOperators;

import java.util.Scanner;

public class Mathpracticeexample2 {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
int area = -99;
int post = -99;
System.out.println("What is the area of the surface?");
area = input.nextInt();
post = area / 9;
System.out.println("Post its needed: " + post); 
}

}
