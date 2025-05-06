package controlstatement_dowhile;

public class Reverse {

	public static void reversing() {

		int i = 10;

		do {
			System.out.println(i);
			i--;
		} while(i >= 1);
	}

	public static void main (String[] args) {
		reversing();
	}
}