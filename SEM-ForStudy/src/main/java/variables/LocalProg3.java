package variables;

public class LocalProg3 {

	public static void voting() {
		int age = 22;
		boolean isAdult = age >= 18;

		System.out.println("Is Eligible to vote: " +isAdult);
	}

	public static void main (String[] args) {
		voting();
	}
}