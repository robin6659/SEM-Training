package Abstraction;

public class PaymentUPI extends PaymentAbstract {

	@Override
	public void makePayment(double amount) {
		System.out.println(amount);	
	}
}