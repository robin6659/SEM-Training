package twointerface;

public class ElectronicWashingMachine implements ElectronicDevice {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Starts Cleaning");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Finished Cleaning");	
	}

	public static void main (String[] args) {
		
		ElectronicDevice washingmachine = new ElectronicWashingMachine();
		ElectronicDevice televison = new ElectronicTV();

		washingmachine.turnOn();
		washingmachine.turnOn();
		
		televison.turnOn();
		televison.turnOff();
	}

}
