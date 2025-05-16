package Interview;

public class Bike extends Car {

	public void color(int a) {
		
		super.color();
		System.out.println("Matte");
	}
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		
		bike.color(10);
		bike.color();
	}
	
}
