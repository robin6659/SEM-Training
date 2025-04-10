package decisionmakingstament;

public class VotingEligibilitybyNestedIf {

	public static void checkVotingEligibility(String nationality, int age) {

		if (nationality == "Indian") {
			/*Inner if condition*/
			if (age >= 18) {
				System.out.println("Eligible to vote in India");
			} else {
				System.out.println("Not Eligible, Age is less than 18");
			}

		} else {
			System.out.println("Not Eligible, Only Indian Citizens can vote");
		}

	}

	public static void main(String[] args) {

		String nationality = "Indian";
		int age = 20;

		checkVotingEligibility(nationality, age);

	}
}