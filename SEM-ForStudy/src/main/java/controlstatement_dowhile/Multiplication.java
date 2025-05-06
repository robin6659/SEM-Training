package controlstatement_dowhile;

public class Multiplication {

	public static void multiply() {

		int i = 1;

		do {
			System.out.println((3 * i));
			i++;
		} while (i <= 10);
	}

	public static void main (String[] args) {
		multiply();
	}
}