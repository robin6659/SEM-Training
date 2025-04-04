package parameterizedandnonparameterized;

public class NonParamProg2 {

	public void SquareCalculator( ) {

		int num = 10;
		int square = num * num;

		System.out.println("Square of "+square);

	}
	public static void main (String[] args) {

		NonParamProg2 squarecalc = new NonParamProg2();
		squarecalc.SquareCalculator();
	}
}