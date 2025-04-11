package stringmethods;

public class CodePointBefore {

	public static void main(String[] args) {

		String myStr = "JAVA";

		/*index 1 means it checks the character before index 1, which is at index 0 => 'J'*/
		int result = myStr.codePointBefore(1);

		System.out.println(result);
	}
}