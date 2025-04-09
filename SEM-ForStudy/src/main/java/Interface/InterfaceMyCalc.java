package Interface;

public class InterfaceMyCalc implements InterfaceCalculator {

	@Override
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		
		System.out.println("Sum " +sum);
	}

	@Override
	public void sub(int num1, int num2) {
		int difference = num1 - num2;
		
		System.out.println("Sum " +difference);
	}

}