package basicprinting;

public class Car {
	public void carFeature() {
		String make = "Porsche";
		String model = "911";
		String color= "Crayon";

		System.out.println("Make of the car is "+make+" and the model is "+model+" wrapped with "+color);
	}

	public static void main (String[] args) {

		Car car = new Car();
		car.carFeature();
		//carFeature();
	}
}