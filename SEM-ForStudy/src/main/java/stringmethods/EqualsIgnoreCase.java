package stringmethods;

public class EqualsIgnoreCase {

	public static void main (String[] args) {

		String myStr1 = "Hello";
		String myStr2 = "HELLO";
		String myStr3 = "Hello HELLO";

		System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
		System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false

	}
}