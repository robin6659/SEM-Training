package Inheritance;

class Vehicle {
	String type = "Vehicle Type: Four Wheeler";
}

class Brand extends Vehicle {
	String brand = "Car Brand: BMW";
}

class Model extends Brand {
	String model = "Model: BMW X5";
}

public class MultiInheritProg1 {
	public static void main(String[] args) {

		Model model = new Model();
		System.out.println(model.type);
		System.out.println(model.brand);
		System.out.println(model.model);
	}
}