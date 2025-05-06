package decisionmaking_ifelse;

public class Voting {

	public void voter() {

		int age = 10;

		if (age >= 18) {

			System.out.println("eligible to vote");

		} else {

			System.out.println("not eligible to vote");

		}		

	}
	public static void main (String[] args) {

		Voting voting = new Voting();
		voting.voter();
	}

}