package selflearn;

import java.util.Scanner;

public class BooleanExp {
	public static void voting() {

		int votingAge = 18;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter age");
		int myAge = scanner.nextInt();

		System.out.println(myAge>=votingAge);

	}

	public static void main (String[] args) {
		voting();
	}
}