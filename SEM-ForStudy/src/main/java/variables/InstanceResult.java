package variables;

public class InstanceResult {

	String name;
	int marks;

	public void checkResult() {

		if (marks>= 28) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main (String[] args) {
		InstanceResult result = new InstanceResult();
		result.name = "Robin";
		result.marks = 29;
		result.checkResult();
	}
}