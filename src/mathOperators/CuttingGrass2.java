package mathOperators;
import java.util.Scanner;
public class CuttingGrass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double length = 1; 
	        double width = 1;
	        double mowerdeck = 1;
	        double speed = 1;
	        final double payment = 12;
	        Scanner input = new Scanner(System.in);
	        System.out.println("The width of the yard?");
	        width = input.nextDouble();
	        System.out.println("The length of the yard?");
	        length = input.nextDouble();
	        System.out.println("The mowerdeck size?");
	        mowerdeck = input.nextDouble();
	        System.out.println("The speed of the mowerdeck?");
	        speed = input.nextDouble();
	        double counts = length/(mowerdeck/12);
	        double longlength = counts * width;
	        double closeunits = longlength/(speed*5820);
	        double time = closeunits*60;
	        double cost = closeunits*12;
	        System.out.println("The time it will take " + time + " minutes, and will cost $" + cost);
	        input.close();
	}

}
