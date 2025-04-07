package Inheritance;

/*Grandparent*/
class InputValues {
	int num1 = 10;
	int num2 = 5;
}

/*Parent*/
class BasicOperation extends InputValues {
	void addition() {
		System.out.println("Addition: " + (num1 + num2));
	}

	void subtraction() {
		System.out.println("Subtraction: " + (num1 - num2));
	}
}

/*Child*/
class Calculator extends BasicOperation {
	void multiplication() {
		System.out.println("Multiplication: " + (num1 * num2));
	}

	void division() {
		System.out.println("Division: " + (num1 / num2));
	}
}

/*Main*/
public class MultiInheritProg3 {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
	}
}
