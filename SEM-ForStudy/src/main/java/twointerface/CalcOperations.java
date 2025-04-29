package twointerface;

public class CalcOperations implements Add, Sub {

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		int z = a + b;
		System.out.println(z);

	}

	@Override
	public void substraction(int a, int b) {
		// TODO Auto-generated method stub
		int z = a - b;
		System.out.println(z);

	}

	public void multilication(int a, int b) {
		// TODO Auto-generated method stub
		int z = a * b;
		System.out.println(z);

	}


	//	public static void main (String[] args) {
	//		CalcOperations calcoperations = new CalcOperations();
	//
	//		calcoperations.addition(4, 7);
	//		calcoperations.substraction(6, 4);
	//	}

}