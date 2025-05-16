package practice;

public class Reverse {
	public static void main(String[] args) {

		// Step 1: Store the original string
		String original = "hello java";

		// Step 2: Create an empty string to store the reversed result
		String reversed = "";

		// Step 3: Start a loop from the last character to the first
		for (int i = original.length() - 1; i >= 0; i--) {

			// reversed += original.charAt(i); 
			// This means: take the current character from the original string
			// and add (append) it to the reversed string.

			reversed = reversed + original.charAt(i);

			// Example:
			// i = 4 -> original.charAt(4) = 'o' -> reversed = "" + 'o' = "o"
			// i = 3 -> original.charAt(3) = 'l' -> reversed = "o" + 'l' = "ol"
			// and so on...
		}

		// Step 4: Print the original and reversed strings
		System.out.println("Original: " + original);   // Output: hello
		System.out.println("Reversed: " + reversed);   // Output: olleh
	}
}
