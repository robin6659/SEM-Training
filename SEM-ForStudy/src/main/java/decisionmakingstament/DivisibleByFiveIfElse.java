package decisionmakingstament;

public class DivisibleByFiveIfElse {
	public static void main(String[] args) {
		int num = 15;

		if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5");
		} else {
			System.out.println(num + " is not divisible by 5");
		}
	}
}