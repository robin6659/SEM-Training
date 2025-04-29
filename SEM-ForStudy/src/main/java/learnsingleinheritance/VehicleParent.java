package learnsingleinheritance;

public class VehicleParent {

	String brand;
	int speed;

	public VehicleParent(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void displayInfo() {
		System.out.println(brand);
		System.out.println(speed);
	}
	
}