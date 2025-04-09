package Abstraction;

public class CalculatorMul extends CalculatorAbstract{

	@Override
	public void outputIs(int num1, int num2) {
		System.out.println("Mul: " +(num1 * num2));	
	}

}