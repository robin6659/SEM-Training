package Assignment;

public class Sort {
	public static void main(String[] args) {
		// This is my list of numbers
		int[] numbers = {5, 2, 9, 1, 3};

		// ------------------------
		// STEP 1: Sort in ascending order (smallest to biggest)
		// ------------------------

		// Go through each number one by one
		for (int i = 0; i < numbers.length; i = i + 1) {

			// Compare with the numbers that come after it
			for (int j = i + 1; j < numbers.length; j = j + 1) {

				// If the first number is bigger, we swap them
				if (numbers[i] > numbers[j]) {

					// Swap means changing their places
					int temp = numbers[i];  // keep first number safe
					numbers[i] = numbers[j]; // put second number in first place
					numbers[j] = temp;      // put saved first number in second place
				}
			}
		}

		// Now the list is sorted in small to big
		System.out.print("Ascending Order: ");
		for (int i = 0; i < numbers.length; i = i + 1) {
			System.out.print(numbers[i] + " ");
		}

		// Go to next line
		System.out.println(); 


		// ------------------------
		// STEP 2: Sort in descending order (biggest to smallest)
		// ------------------------

		// Go through each number one by one again
		for (int i = 0; i < numbers.length; i = i + 1) {

			// Compare with the numbers that come after it
			for (int j = i + 1; j < numbers.length; j = j + 1) {

				// If the first number is smaller, we swap them
				if (numbers[i] < numbers[j]) {

					// Swap means changing their places
					int temp = numbers[i];  // keep first number safe
					numbers[i] = numbers[j]; // put second number in first place
					numbers[j] = temp;      // put saved first number in second place
				}
			}
		}

		// Now the list is sorted in big to small
		System.out.print("Descending Order: ");
		for (int i = 0; i < numbers.length; i = i + 1) {
			System.out.print(numbers[i] + " ");
		}
	}
}
