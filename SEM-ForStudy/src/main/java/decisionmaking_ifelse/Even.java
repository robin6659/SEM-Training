package decisionmaking_ifelse;

public class Even {

	public static void evenoddcheck() {

		int num = 7;

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	public static void main (String[] args) {
		evenoddcheck();
	}
}