package decisionmaking_switch;

public class CalculatorSwitch {

	public static void calculator() {
		int a = 10, b = 5;
		char operator = '+';

		switch (operator) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

	public static void main(String[] args) {
		calculator();
	}
}