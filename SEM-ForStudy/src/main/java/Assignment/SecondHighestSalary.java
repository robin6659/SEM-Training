package Assignment;

import java.util.Arrays;
import java.util.List;

public class SecondHighestSalary {
	public static void main(String[] args) {
		// Step 1: A list of salaries we need to check
		List<Integer> salaries = Arrays.asList(25000, 40000, 35000, 60000, 50000);

		// Step 2: We will store the highest and second-highest salary in these variables
		int highest = Integer.MIN_VALUE;  // This will store the highest salary
		int secondHighest = Integer.MIN_VALUE;  // This will store the second-highest salary

		// Step 3: Go through each salary one by one
		// We use a regular for loop to go through each salary
		for (int i = 0; i < salaries.size(); i++) {
			// Get the current salary from the list
			int salary = salaries.get(i);

			// Step 4: Check if the current salary is higher than the highest salary
			if (salary > highest) {
				secondHighest = highest;  // The old highest becomes the second-highest
				highest = salary;  // Now, update the highest salary to the current salary
			}
			// Step 5: Check if the current salary is between the highest and second-highest
			else if (salary > secondHighest && salary < highest) {
				secondHighest = salary;  // Update the second-highest salary
			}
		}

		// Step 6: After the loop, check if we found a valid second-highest salary
		if (secondHighest != Integer.MIN_VALUE) {
			// If we found the second-highest, print it
			System.out.println("Second Highest Salary: " + secondHighest);
		} else {
			// If there's no second-highest (like when all salaries are the same), print this message
			System.out.println("No second-highest salary found.");
		}
	}
}