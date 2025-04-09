package Interface;

public class InterfaceCalcMain {

	public static void main(String[] args) {

		InterfaceCalculator mycalc = new InterfaceMyCalc();

		mycalc.add(5, 1);
		mycalc.sub(2, 1);
	}
}