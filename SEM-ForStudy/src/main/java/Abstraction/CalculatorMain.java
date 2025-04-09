package Abstraction;

public class CalculatorMain {

	public static void main (String[] args) {

		CalculatorAbstract calcAdd = new CalculatorAdd();
		calcAdd.outputIs(5, 4);

		CalculatorAbstract calcSub = new CalculatorSub();
		calcSub.outputIs(6, 4);

		CalculatorAbstract calcMul = new CalculatorMul();
		calcMul.outputIs(5, 1);

	}
}