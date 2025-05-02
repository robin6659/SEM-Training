package Abstraction;

public class Bike extends Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bikes using kick");
	}

	public static void main (String[] args) {
		
        Bike bike = new Bike();
        bike.start();
        bike.fuel();

        Car car = new Car();
        car.start();
        car.fuel();

	}
}
