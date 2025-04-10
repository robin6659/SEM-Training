package decisionmakingstament;

public class VotingEligibilitybyIfElse {

	public static void checkVotingEligibility(int age) {

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible to v");
		}
	}

	public static void main(String[] args) {

		int age = 20; /*input*/

		checkVotingEligibility(age);

	}
}