package stringmethods;

public class CompareToIgnoreCase {

	public static void main(String[] args) {

		String myStr1 = "HELLO";
		String myStr2 = "hello";

		System.out.println(myStr1.compareToIgnoreCase(myStr2));
		
		/*ignoring lower case and upper case differences, Returns 0 when they are equal*/
	}
}