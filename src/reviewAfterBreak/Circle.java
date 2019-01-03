package reviewAfterBreak;

public class Circle {
	private double radius;

	public Circle() {
		radius = 0;
	}

	public Circle(double radiusx) {
		if (radiusx > 0)
			radius = radiusx;
		else
			radius = 10;
	}

	public void setRadius(double radiusx) {
		if (radiusx > 0)
			radius = radiusx;
		else
			radius = 10;
	}

	public double getRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * (Math.PI * radius);
	}

	public double area() {
		return Math.PI * (radius * radius);
	}
}
