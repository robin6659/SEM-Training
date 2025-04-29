package twointerface;

public class MainCalc {

	public static void main (String[] args) {
		CalcOperations calcoperations = new CalcOperations();

		calcoperations.addition(4, 7);
		calcoperations.substraction(6, 4);
		calcoperations.multilication(5, 4);

	}
}