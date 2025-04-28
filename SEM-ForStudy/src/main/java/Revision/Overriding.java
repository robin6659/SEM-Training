package Revision;

class Car {
	public void fueltype () {
		System.out.println("Petrol");
	}
}

class Hybrid {
	public void fueltype () {
		System.out.println("Petrol+Battery");
	}
}

public class Overriding {

	public static void main (String[] args) {

		Hybrid hyb = new Hybrid();

		hyb.fueltype();
	}
}