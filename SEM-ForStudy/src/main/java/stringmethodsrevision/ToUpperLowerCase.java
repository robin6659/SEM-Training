package stringmethodsrevision;

public class ToUpperLowerCase {

	public static void toupperlower() {

		String text1 = "hello world";
		String text2 = "HELLO WORLD";

		String result1 = text1.toUpperCase();
		String result2 = text2.toLowerCase();

		System.out.println("toUpperCase: "+result1);
		System.out.println("toLowerCase: "+result2);

	}

	public static void main(String[] args) {
		toupperlower();
	}
}