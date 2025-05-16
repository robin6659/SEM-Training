package twointerface;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Hello Shape Rectangle here");
	}

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();

		Circle circle = new Circle();
		circle.draw();

	}
}