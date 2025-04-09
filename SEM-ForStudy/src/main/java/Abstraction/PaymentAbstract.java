package Abstraction;

public abstract class PaymentAbstract {

	/*Abstract Method - Must implement in child class*/
	public abstract void makePayment (double amount);

	public void paymentInfo() {

		System.out.println("Payment processing");
	}
}