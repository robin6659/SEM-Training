package Interview;

public class Calculator {

	public void addNumber (int a, int b) {

		int sum = a+b;

		System.out.println(sum);
	}

	public static void main (String[] args) {

		Calculator calculator = new Calculator ();
		calculator.addNumber(5, 4);
	}
}