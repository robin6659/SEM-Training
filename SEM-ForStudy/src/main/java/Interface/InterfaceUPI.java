package Interface;

public class InterfaceUPI implements InterfacePayment {

	@Override
	public void makePayment(double amount) {
		System.out.println(amount);			
	}

}