package basicprinting;

public class Operators {

	public static void sum() {
		int sum1 = 62 + 3;
		int sum2 = sum1 + 60;
		int sum3 = sum2 + sum1;

		System.out.println("Sum1 "+sum1);
		System.out.println("Sum2 "+sum2);
		System.out.println("Sum3 "+sum3);
	}
	public static void main (String[] args) {
		sum();
	}
}