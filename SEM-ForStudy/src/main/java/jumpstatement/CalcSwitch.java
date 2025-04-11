package jumpstatement;

public class CalcSwitch {

	public static void main(String[] args) {
		int a = 22;
		int b = 4;
		char operator = '/';

		switch(operator) {
		case '+':
			System.out.println("Addition = " + (a+b));
			break;
		case '-':
			System.out.println("Subtraction = " + (a-b));
			break;
		case '*':
			System.out.println("Multiplication = " + (a*b));
			break;
		case '/':
			System.out.println("Division = " + (a/b));
			break;
		default:
			System.out.println("Invalid");
		}
	}
}