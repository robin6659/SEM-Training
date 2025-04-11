package decisionmakingstament;

public class BloodDonationNestedIf {
	public static void main(String[] args) {
		int age = 20;
		int weight = 55;

		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("Eligible to donate blood");
			} else {
				System.out.println("Not eligible, Underweight)");
			}
		} else {
			System.out.println("Not eligible, Underage");
		}
	}
}