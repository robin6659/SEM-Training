package overloading;

public class Vehicle {

	public void start() {
		System.out.println("Starting");
	}

	public void start(String fuelType) {
		System.out.println("Starting "+fuelType);
	}

	public void start(String fuelType, String engineType) {
		System.out.println("Starting "+fuelType+engineType);

	}
}