package input;
import java.util.Scanner;
public class MonkeyHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
        System.out.println ("What is the heigh of the monkey?");
        double height;
        height = input.nextDouble();
        System.out.println("The height is " + height);
        input.close();
	}

}
