package decisionmakingstament;

public class GreatestNestedIf {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 15;

		if (a > b) {

			if (a > c) {
				System.out.println("Greatest is: " + a);
			} else {
				System.out.println("Greatest is: " + c);
			}

		} else {

			if (b > c) {
				System.out.println("Greatest is: " + b);
			} else {
				System.out.println("Greatest is: " + c);
			}
		}
	}
}
