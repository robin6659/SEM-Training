package stringmethods;

public class CodePointAt {

	/* codePointAt(index) returns unicode (ASCII) char at specified index.*/

	public static void main(String[] args) {

		String myStr = "JAVA";

		int result = myStr.codePointAt(2);
		System.out.println(result);

	}
}