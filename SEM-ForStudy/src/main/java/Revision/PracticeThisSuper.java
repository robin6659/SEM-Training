package Revision;

/*Parent*/
class VehicleType {
	String brand;

	VehicleType(String brand) {
		this.brand = brand;
	}

	void displayBrand() {
		System.out.println(brand);
	}
}

/*Child*/
class Motorcycle extends VehicleType {

	String model;

	Motorcycle(String brand, String model) {
		super(brand);

		this.model = model;
	}

	void displayOut() {
		super.displayBrand();
		System.out.println(model);
	}

}
public class PracticeThisSuper {

	public static void main (String[] args) {

		Motorcycle mycycl = new Motorcycle("Yamaha", "R1");
		mycycl.displayOut();
	}

}