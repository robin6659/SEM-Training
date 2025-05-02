package Interface;

public class MainCharge {

	public static void main(String[] args) {

		Phone phone = new Phone();
		IceCar icecar = new IceCar();

		phone.charge();
		icecar.charge();
	}
}