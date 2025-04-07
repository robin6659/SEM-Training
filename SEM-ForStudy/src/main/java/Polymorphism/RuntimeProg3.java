package Polymorphism;

class Vehicle {
	double fuelEfficiency() {
		return 0;
	}
}

class Car extends Vehicle {
	double fuelEfficiency() {
		return 15;
	}
}

class Truck extends Vehicle {
	double fuelEfficiency() {
		return 8;
	}
}

public class RuntimeProg3 {
	public static void main(String[] args) {
		Vehicle car = new Car();
		System.out.println("Car Efficiency " + car.fuelEfficiency() + " km/l");

		Vehicle truck = new Truck();
		System.out.println("Truck Efficiency " + truck.fuelEfficiency() + " km/l");
	}
}