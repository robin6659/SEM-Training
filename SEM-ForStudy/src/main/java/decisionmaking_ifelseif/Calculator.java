package decisionmaking_ifelseif;

public class Calculator {

	public static void simplecalculator() {

		int a = 2;
		int b = 4;
		char operator = '*';

		if (operator == '+') {
			System.out.println(a + b);
		} else if (operator == '-') {
			System.out.println(a - b);
		} else if (operator == '*') {
			System.out.println(a * b);
		} else if (operator == '/') {
			System.out.println(a / b);
		} else {
			System.out.println("Invalid");
		}

	}

	public static void main (String[] args) {
		simplecalculator();
	}

}
