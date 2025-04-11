package stringmethods;

public class ReplaceAll {

	public static void main(String[] args) {
		String myStr = "I love cats. Cats are very easy to love. Cats are very Loyal.";
		String regex = "(?i)cat";/*"(?i), Ignore uppercase and lowercase difference while matching."*/
		System.out.println(myStr.replaceAll(regex, "dog"));
	}

}