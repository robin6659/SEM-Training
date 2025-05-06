package decisionmaking_if;

public class Even {

	public void evenornot() {

		int	num = 10;

		if (num % 2 == 0) {
			System.out.println("Number is even");
		}
	}

	public static void main(String[] args) {

		Even even = new Even();

		even.evenornot();
	}
}