package Revision;

// Interface with a method declaration
interface Testable {
	void runTest();
}

// Class implementing the interface
class StringTest implements Testable {

	String input;

	// Constructor to initialize the input string
	StringTest(String input) {
		this.input = input;
	}

	// Implementation of runTest() from Testable
	public void runTest() {
		System.out.println("Original String: "      + input);

		// Important String methods:
		System.out.println("Length: "               + input.length());
		System.out.println("Uppercase: "            + input.toUpperCase());
		System.out.println("Lowercase: "            + input.toLowerCase());
		System.out.println("Starts with 'T'? "      + input.startsWith("T"));
		System.out.println("Ends with 'g'? "        + input.endsWith("g"));
		System.out.println("Contains 'est'? "       + input.contains("est"));
		System.out.println("Replace 'e' with 'X': " + input.replace('e', 'X'));

		// Split the string by space
		String[] words = input.split(" ");
		System.out.println("Words in the string:");
		for (String word : words) {
			System.out.println("- " + word);
		}
	}
}

// Main class to run the program
public class TestInterface {
	public static void main(String[] args) {
		// Create an object and call the method
		Testable test = new StringTest("Testing Interface String Methods");
		test.runTest();
	}
}