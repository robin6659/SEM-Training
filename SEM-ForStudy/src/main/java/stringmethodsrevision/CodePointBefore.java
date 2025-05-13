package stringmethodsrevision;

public class CodePointBefore {

	public static void codepointbefore() {

		String text = "Hello World";

		int result1 = text.codePointBefore(4);
		System.out.println(result1);
	}

	public static void main(String[] args) {
		codepointbefore();
		
		/*codePointBefore(4) → gets before index 4 (which is index 3(l)).*/
	}

}