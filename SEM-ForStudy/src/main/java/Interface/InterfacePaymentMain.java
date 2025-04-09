package Interface;

public class InterfacePaymentMain {

	public static void main (String[] args) {

		/*Object created using parent reference and child class*/
		InterfacePayment payupi = new InterfaceUPI();
		payupi.makePayment(980);

		InterfacePayment payDebit = new InterfaceDebit();
		payDebit.makePayment(870);

	}
}