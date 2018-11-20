package oOP;

public class NumbersOOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersOOP man = new NumbersOOP();
		man.sayNumber(3);
		man.sayNumberPlus2(9);
		man.saySum(1042, 3);
		double num = man.returnSquare(9);
		System.out.println("The square of the number is " + num + ".");
		double area = man.returnArea(3, 5);
		System.out.println("The area of the rectangle is " + area + ".");
		double round = man.returnRoundUp(5.5);
		System.out.println("Rounding the previous number created " + round + ".");
		//edit
	}

}
