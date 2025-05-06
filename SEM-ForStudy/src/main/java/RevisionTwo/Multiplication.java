package RevisionTwo;

public class Multiplication {

	public int multiply (int a, int b) {

		return a * b;
	}

	public void add (int a, int b) {

		int sum = a+b;
		System.out.println(sum);

	}

	public static void main (String[] args) {
		Multiplication multiplication = new Multiplication();
		int result = multiplication.multiply(2, 3);
		System.out.println(result);
		
		multiplication.add(40, 10);
	}

}