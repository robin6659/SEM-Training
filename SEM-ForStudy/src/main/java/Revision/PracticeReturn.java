package Revision;

public class PracticeReturn {

	public static int addNumbers(int a, int b) {

		int sum = a+b;

		return sum;

	}

	public static void main (String[] args) {

		int result = addNumbers(10,20);
		System.out.println("Sum is " +result);
	}

}