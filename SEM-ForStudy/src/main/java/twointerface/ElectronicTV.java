package twointerface;

public class ElectronicTV implements ElectronicDevice {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is OFF");
	}

}
