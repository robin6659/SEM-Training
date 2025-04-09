package Abstraction;

public class PaymentMain {

	public static void main (String[] args) {

		/*Object created using parent reference and child class*/
		PaymentAbstract payupi = new PaymentUPI();
		payupi.makePayment(900);
	}
}