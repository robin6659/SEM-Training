package basicprinting;

public class MathOperations {

	public static void operations() {
		int a = 9;
		int b = 3;

		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		int quotient = a / b;

		System.out.println("The sum is "+sum);
		System.out.println("The difference is "+difference);
		System.out.println("The product is "+product);
		System.out.println("The quotient is "+quotient);
	}

	public static void main (String[] args) {
		operations();
	}
}