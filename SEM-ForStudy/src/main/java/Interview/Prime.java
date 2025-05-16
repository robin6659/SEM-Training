package Interview;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 20 are:");

		for (int number = 2; number <= 20; number++) {
			boolean isPrime = true;

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(number + " ");
			}
		}
	}
}