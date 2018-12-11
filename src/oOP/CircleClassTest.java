package oOP;


public class CircleClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleClass circl = new CircleClass();
		circl.changeRadius(2);//radius
		double circ = circl.circumference();
		double area = circl.area();
		System.out.println("The circumference is "+circ);
		System.out.println("The area is "+area);
		
		
	}

}
