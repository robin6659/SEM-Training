package decisionmakingstament;

public class TemperatureCheckIfElseIf {
	public static void main(String[] args) {
		int temp = 19;

		if (temp > 40) {
			System.out.println("Very Hot");
		} else if (temp > 30) {
			System.out.println("Hot");
		} else if (temp > 20) {
			System.out.println("Warm");
		} else if (temp > 10) {
			System.out.println("Cold");
		} else {
			System.out.println("Very Cold");
		}
	}
}