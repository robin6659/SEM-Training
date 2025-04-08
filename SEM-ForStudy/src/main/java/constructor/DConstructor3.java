package constructor;

public class DConstructor3 {

	int a, b;

	DConstructor3() {
		a = 20;
		b = 10;

		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
	}

	public static void main(String[] args) {
		DConstructor3 calc = new DConstructor3();
	}
}