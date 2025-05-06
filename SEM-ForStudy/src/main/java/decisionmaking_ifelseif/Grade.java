package decisionmaking_ifelseif;

public class Grade {

	public void gradecheck() {

		int marks = 82;

		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 80) {
			System.out.println("Grade B");
		} else if (marks >= 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
	}

	public static void main (String[] args) {
		Grade grade = new Grade();
		grade.gradecheck();
	}

}