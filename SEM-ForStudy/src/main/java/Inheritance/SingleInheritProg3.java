package Inheritance;

class Car {
	String brand = "Car Brand: BMW";

	void carDetails() {
		System.out.println(brand);
	}
}

class BMW extends Car {
	String model = "Model: BMW X5";

	void bmwDetails() {
		System.out.println(model);
	}
}

public class SingleInheritProg3 {
	public static void main(String[] args) {

		BMW bmw = new BMW();

		bmw.carDetails();
		bmw.bmwDetails();
	}
}