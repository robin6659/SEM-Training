package datatypes;

import java.util.Arrays;

public class DataTypesExample {

	public static void main (String[] args) {

		int num = 10;
		float price = 99.99f;
		char grade = 'A';
		boolean isPassed = true;

		System.out.println(num);
		System.out.println(price);
		System.out.println(grade);
		System.out.println(isPassed);
		System.out.println("----------------");

		String name = "Robin";
		Integer[]  numbers = {6,8,2,11,0};
		int[] marks = {90,94,70};

		System.out.println(name);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(marks));

	}
}