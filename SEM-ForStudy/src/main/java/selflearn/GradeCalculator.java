package selflearn;

import java.util.Scanner;

public class GradeCalculator {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scanner.nextInt();

		if(marks >= 90) {
			System.out.println("A");
		} else if (marks >= 75) {
			System.out.println("B");
		} else if (marks >= 50) {
			System.out.println("C");
		} else {
			System.out.println("Failed");
		}
	}
}