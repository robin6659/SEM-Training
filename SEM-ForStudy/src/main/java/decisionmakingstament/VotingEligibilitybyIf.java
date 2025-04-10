package decisionmakingstament;

public class VotingEligibilitybyIf {

	public static void checkVotingEligibility(int age) {

		if (age >= 18) {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {

		int age = 20; /*input*/

		checkVotingEligibility(age);

	}
}