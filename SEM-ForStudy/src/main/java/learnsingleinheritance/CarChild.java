package learnsingleinheritance;

public class CarChild extends VehicleParent {

	int doors;

	public CarChild(String brand, int speed, int doors) {
		super(brand, speed);
		this.doors= doors;	
	}

	public void displayInfo() {
		super.displayInfo();  /*Reusing parent method*/
		System.out.println(doors);
	}

}