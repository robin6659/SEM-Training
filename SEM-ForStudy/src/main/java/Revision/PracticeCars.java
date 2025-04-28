package Revision;

public class PracticeCars implements PracticeVehicle {

	@Override
	public void vehicleStarts() {
		// TODO Auto-generated method stub
		int fuelLevel = 10;
		int engineTemp = 106;

		if (fuelLevel >= 10 ) {

			if (engineTemp >= 105) {
				System.out.println("Safe drive");
			} else {
				System.out.println("Wait for warmup");
			}

		} else {
			System.out.println("Lowfuel warning");
		}
	}

	@Override
	public void vehicleStops() {
		for(int i=1; i<=3; i++) {
			System.out.println("Cooling down");
		}
	}

}
