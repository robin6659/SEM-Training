package RevisionTwo;

public class Circle implements Shape {

	double radius;

	public Circle (double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub

		double area = 3.14 * radius * radius;
		System.out.println(area);
	}

	public static void main (String[] args) {

		Shape circle = new Circle(4);
		circle.calculateArea();
	}

}