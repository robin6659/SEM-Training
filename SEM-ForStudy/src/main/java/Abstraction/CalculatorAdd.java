package Abstraction;

public class CalculatorAdd extends CalculatorAbstract {

	@Override
	public void outputIs(int num1, int num2) {
		System.out.println("Add: " +(num1 + num2));	
	}

}