package stringmethodsrevision;

public class CodePointAt {

	public static void codepointat() {
		String text = "Hello World";

		int result1 = text.codePointAt(4);
		System.out.println(result1);
	}
	public static void main(String[] args) {
		codepointat();
		/*codePointAt(4) returns 'o', unicode is 111.*/

	}

}