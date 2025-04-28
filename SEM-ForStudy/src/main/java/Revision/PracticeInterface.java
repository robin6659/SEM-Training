package Revision;

interface Vehicle {

	public void starts();
	public void stops();

}

class Cars implements Vehicle {

	@Override
	public void starts() {

		int fuelLevel = 10;

		if (fuelLevel >= 10) {
			System.out.println("The vehicle starts");
		} else {
			System.out.println("Low fuel warning");
		}

	}

	@Override
	public void stops() {

		for(int i = 1; i <= 3; i++) {
			System.out.println("Shutting down "+i);
		}
	}}

public class PracticeInterface {
	public static void main (String[] args) {

		Cars myCar = new Cars();

		myCar.starts();
		myCar.stops();

	}
}
