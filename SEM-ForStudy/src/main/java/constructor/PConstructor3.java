package constructor;

public class PConstructor3 {

	PConstructor3(int num1, int num2) {
		int sum = num1 + num2;

		System.out.println(sum);
	}

	PConstructor3(int num1) {
		int sqr = num1 * num1;

		System.out.println(sqr);
	}

	PConstructor3(int num1, int num2, int num3) {
		int pro = num1 * num2 * num3;

		System.out.println(pro);
	}

	public static void main (String[] args) {
		PConstructor3 sum = new PConstructor3(2,5);
		PConstructor3 sqr = new PConstructor3(5);
		PConstructor3 pro = new PConstructor3(5,1,2);

	}
}