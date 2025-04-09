package Interface;

public class InterfaceDebit implements InterfacePayment {

	@Override
	public void makePayment(double amount) {
		System.out.println(amount);		
	}

}