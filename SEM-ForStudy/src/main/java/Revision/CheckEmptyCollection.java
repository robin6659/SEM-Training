package Revision;

import java.util.ArrayList;
import java.util.List;

public class CheckEmptyCollection {

	public static void main(String[] args) {

		List<String> tests = new ArrayList<>();

		tests.add("Sign in");
		tests.add("Sign out");
		tests.add("Check out");

		if(tests.isEmpty()) {
			System.out.println("No tests to run");
		}
		else {			
			System.out.println("Running tests");
		}
	}
}