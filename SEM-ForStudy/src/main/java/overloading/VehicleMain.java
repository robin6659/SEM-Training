package overloading;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle ();
		vehicle.start();
		vehicle.start("Diesel");
		vehicle.start("Diesel ","V8");
		
		System.out.println("-----------");
		
		EVVehicle evvehicle = new EVVehicle();
		evvehicle.start("Electric");
	}

}
