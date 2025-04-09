package Abstraction;

public class CalculatorSub extends CalculatorAbstract {

	@Override
	public void outputIs(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
	}

}